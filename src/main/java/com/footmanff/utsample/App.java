package com.footmanff.utsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

/**
 * Hello world!
 */
@SpringBootConfiguration
@EnableAutoConfiguration( exclude = {DataSourceAutoConfiguration.class} )
@ComponentScan( "com.footmanff.utsample" )
public class App {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");
    }
    
}
