package com.optum.day1project.utilities;

def users=['user1':'test@123','user2':'test@456']

//key and value
//for (def user : users)
//	println "$user.key==>$user.value"

	
users.each { key, value -> println users[key]}

def employees=['emp11':84758,'emp2':34659]
employees.each { key, value -> employees[key]=value*2}
employees.each { key, value -> println employees[key]}