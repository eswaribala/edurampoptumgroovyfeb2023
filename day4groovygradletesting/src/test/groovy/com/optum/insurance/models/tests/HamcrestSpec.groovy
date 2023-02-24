package com.optum.insurance.models.tests

import spock.lang.Specification

import static spock.util.matcher.HamcrestMatchers.closeTo

class HamcrestSpec extends Specification{

    def "comparing two decimal numbers"() {
        def cost = new Random().nextInt(10)+1000

        expect:
        cost closeTo(1008 , 0.999999)
    }
}
