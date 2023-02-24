package com.cts.groovytests
import spock.lang.Specification

class BasicSpockTest extends Specification{
	
	 def "should not be empty after adding element"() {
	   given:
	   // [] is Groovy literal for List and is infered
	   def list = []
	
	   when:
	   list.add(42)
	   list.add(67)
	
	   then:
	   // Asserts are implicit and not need to be stated.
	   // Change "==" to "!=" and see what's happening!
	   println(list.size())
	   list.size() == 2
	   //list.get(0) == [42]
	 }
}
