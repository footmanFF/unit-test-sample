package com.footmanff.utsample.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author footmanff on 2018/8/29.
 */
@Service
public class SomeServiceImpl implements SomeService {

    @Resource
    public SomeDependenceService someDependenceService;

    @Resource
    private OtherService otherService;

    @Override
    public String getNameById(Integer id) {
        return String.format("[%s]-[%s]-[%s]", otherService.method(), id, someDependenceService.dependMethod());
    }

}
