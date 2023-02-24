package com.optum.insurance.tests

import groovyjarjarpicocli.CommandLine
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import spock.lang.Specification
@RunWith(Parameterized.class)
class StackSpec extends Specification {

    def "adding an element leads to size increase"() {
        setup: "a new stack instance is created"
        def stack = new Stack()

        when:
        stack.push 42

        then:
        stack.size() == 1
    }




        def "check case-insensitive equality of 2 strings"() {

            given:
            String str1 = "hello"
            String str2 = "HELLO"

            when:
            str1 = str1.toLowerCase()
            str2 = str2.toLowerCase()

            then:
            str1 == str2

        }

        def "check addition of 2 numbers"() {

            given:
            int input1 = 10
            int input2 = 25

            when:
            int result = input1 + input2

            then:
            result == 35
        }

    def "Should get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)
        list.size() == 4
    }


}
