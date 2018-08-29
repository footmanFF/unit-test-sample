package com.footmanff.utsample.service;

import org.springframework.stereotype.Service;

/**
 * @author footmanff on 2018/8/29.
 */
@Service
public class SomeDependenceServiceImpl implements SomeDependenceService {

    @Override
    public String dependMethod() {
        return ""; // to be mocked
    }
    
}
