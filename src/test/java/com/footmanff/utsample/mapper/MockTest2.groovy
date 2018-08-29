package com.footmanff.utsample.mapper

import com.footmanff.utsample.service.SomeDependenceService
import com.footmanff.utsample.service.SomeService
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import spock.lang.Specification
import spock.mock.DetachedMockFactory

import javax.annotation.Resource

/**
 * @author footmanff on 2018/8/29.
 */
@SpringBootTest
class MockTest2 extends Specification {

    @Resource
    SomeService someService

    @Resource
    SomeDependenceService someDependenceService

    def "mock 测试"() {
        given:
        someDependenceService.dependMethod() >> "someDependenceService.dependMethod result"

        when:
        String value = someService.getNameById(2)
        println("value: " + value)

        then:
        1 == 1
    }

    @TestConfiguration
    static class TestConfig {
        private DetachedMockFactory factory = new DetachedMockFactory()
        
        @Bean
        SomeDependenceService someDependenceService() {
            factory.Mock(SomeDependenceService)
        }
    }

}
