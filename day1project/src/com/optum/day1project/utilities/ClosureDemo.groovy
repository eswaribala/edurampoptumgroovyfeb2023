package com.optum.day1project.utilities;

def employees=[]

for(def i : 1..100) {
	employees.add(new Employee(new Random().nextInt(1000),
		"emp"+i))
}

//comparator with closure
employees.sort{e1,e2 -> e1.getName().compareTo(e2.getName())}

//comparator with closure with employee id
//closure
employees.each{e1->println e1.getName()}
employees.sort { e1, e2 -> e1.getEmployeeId()-
	(e2.getEmployeeId()) }

//closure
employees.each{e1->println e1.getName()}