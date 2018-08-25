package com.footmanff.utsample.mapper

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import javax.annotation.Resource

/**
 * @author footmanff on 2018/8/25.
 */
@SpringBootTest
class OrderMapperTest extends Specification {

    @Resource
    OrderMapper orderMapper

    def 'orderMapper selectByPrimaryKey'() {
        when:
        def order = orderMapper.selectByPrimaryKey(4720875)

        then:
        order != null
    }

}
