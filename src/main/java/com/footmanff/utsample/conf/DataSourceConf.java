package com.footmanff.utsample.conf;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author footmanff on 2018/8/24.
 */
@Configuration
@Slf4j
public class DataSourceConf {

    public static final String MYSQL_SUFFIX = "?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&autoReconnect=true&allowMultiQueries=true&tinyInt1isBit=false";

    private String jdbcUrl = "jdbc:mysql://localhost:3306/ggj_ygg_sale_platform";

    private String username = "root";

    private String password = "root";

    private Integer jdcdConnectInitSize = 20;

    private Integer jdcdConnectMaxSize = 300;

    private Integer jdcdConnectMinSize = 20;

    @Bean( initMethod = "init" )
    public DruidDataSource dataSource() {
        log.info("dataSource init start");
        try (DruidDataSource datasource = new DruidDataSource()) {
            datasource.setUrl(jdbcUrl + MYSQL_SUFFIX);
            datasource.setUsername(username);
            datasource.setPassword(password);
            //配置连接池的初始化大小，最大值，最小值
            datasource.setInitialSize(jdcdConnectInitSize);
            datasource.setMaxActive(jdcdConnectMaxSize);
            datasource.setMinIdle(jdcdConnectMinSize);
            //配置获取连接等待超时的时间
            datasource.setMaxWait(60000);
            //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
            datasource.setTimeBetweenEvictionRunsMillis(60000);
            //配置一个连接在池中最小生存的时间，单位是毫秒
            datasource.setMinEvictableIdleTimeMillis(300000);
            //推荐的配置
            datasource.setValidationQuery("SELECT 'x'");//用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会起作用。
            datasource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
            datasource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
            datasource.setTestOnReturn(false);//归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
            datasource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭
            datasource.setMaxPoolPreparedStatementPerConnectionSize(-1);//要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
            //慢sql的记录
            datasource.setFilters("stat");
            StatFilter statFilter = new StatFilter();
            statFilter.setSlowSqlMillis(200);
            statFilter.setLogSlowSql(true);
            datasource.setProxyFilters(Arrays.asList(statFilter));
            log.info("dataSource init finish");
            return datasource;
        } catch (Exception e) {
            log.error("dataSource init error", e);
        }
        return null;
    }

}
