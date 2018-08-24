package com.footmanff.utsample.conf;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author footmanff on 2018/8/24.
 */
@Service
public class A {
    
    @Resource
    private DataSource dataSource;
    
}
