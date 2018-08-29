package com.footmanff.utsample.service;

import org.springframework.stereotype.Service;

/**
 * @author footmanff on 2018/8/29.
 */
@Service
public class OtherServiceImpl implements OtherService {

    @Override
    public String method() {
        return "OtherService.method";
    }
}
