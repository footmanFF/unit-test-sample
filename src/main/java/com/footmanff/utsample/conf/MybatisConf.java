package com.footmanff.utsample.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author footmanff on 2018/8/24.
 */
//@Configuration
//@MapperScan( basePackages = "com.footmanff.utsample.mapper" )
public class MybatisConf {

    @Resource( name = "dataSource" ) 
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory salePlatformSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.footmanff.utsample.entity");
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "mapper/*/*Mapper.xml";
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(packageSearchPath));
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTempldate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
