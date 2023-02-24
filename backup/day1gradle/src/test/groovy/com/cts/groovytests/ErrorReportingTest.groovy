package com.cts.groovytests

import spock.lang.Specification

class ErrorReportingTest extends Specification{
	def 'should select max of two numbers'() {
		expect:
		Math.max(a, b) == c
 
		where:
		a | b | c
		5 | 1 | 5
		9 | 9 | 8
	}
}
