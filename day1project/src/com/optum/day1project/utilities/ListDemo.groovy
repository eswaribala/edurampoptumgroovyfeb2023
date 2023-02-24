package com.optum.day1project.utilities;

//heterogeneous list
def customerData=[23858,'Parameswari',true,48689.89]

//for(def data : customerData)
//	println data
//closure
def expr= {input->println input}	
//closure test
assert expr instanceof Closure

//closure
customerData.each{println it}
	
	
//print size

println "Size= $customerData.size"

//append the data
customerData.add('Chennai')

println "Size= $customerData.size"

//remove the element position 2
customerData.remove(2)

for(def data : customerData)
	println data