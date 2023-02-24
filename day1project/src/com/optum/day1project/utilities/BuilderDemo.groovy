package com.optum.day1project.utilities

@Grab('org.codehaus.groovy:groovy-xml:3.0.9')
import groovy.xml.*

def page=new MarkupBuilder()
page.html{
	head {title 'Optum'}
	body { 
		h1 'Optum Project Architecture'
		div{
			p 'Solution Architecture'
		}
		ol{
			for(count in 1..5) {
				li "Project $count"
			}
			
		}
	}
}
