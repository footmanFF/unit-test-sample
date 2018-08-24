package com.footmanff.utsample.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author footmanff on 2018/8/24.
 */
@Configuration
public class TestConf {

    @Resource( name = "dataSource")
    private DataSource dataSource;
    
    @Resource
    private A a;
    
    @Bean
    public B b() {
        return new B();
    }
    
}
