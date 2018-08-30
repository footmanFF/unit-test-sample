package com.footmanff.utsample.mapper

import com.footmanff.utsample.service.SomeDependenceService
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import javax.annotation.Resource

/**
 * @author footmanff on 2018/8/30.
 */
@SpringBootTest
class AnotherTest extends Specification{

    @Resource
    SomeDependenceService someDependenceService

    /**
     * someDependenceService注入的不是mock对象，而是真实的bean
     */
    def "mock test"() {
        when:
        def f = someDependenceService.dependMethod()
        
        then:
        f == "haha"
    }

}
