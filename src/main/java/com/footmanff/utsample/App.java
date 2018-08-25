package com.footmanff.utsample;

import com.footmanff.utsample.entity.OrderEntity;
import com.footmanff.utsample.mapper.OrderMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication( exclude = DataSourceAutoConfiguration.class )
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        OrderMapper orderMapper = applicationContext.getBean(OrderMapper.class);
        OrderEntity orderEntity = orderMapper.selectByPrimaryKey(4720875);
    }

}
