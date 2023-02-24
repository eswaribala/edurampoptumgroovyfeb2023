package com.optum.day1project.utilities

def emptyMap = [:]
def emptyList = []
def map =  [name: 'Dave', age: 31, suburb: 'Sydney', status: 'coder']
def listOfThings = ['itemOne','itemTwo','itemThree']

map.each { println "KeyName: $it.key = Value: $it.value" }

map.each { entry -> println "Key: $entry.key, Value: $entry.value" }

map.each { key, val ->
	println "Key: $key , Value: $val"
}

map.eachWithIndex { entry, index ->
	def indent = ((index == 0 || index % 2 == 0) ? "   " : "")
	println "Index: $index, Key: $entry.key, Value: $entry.value"
}

map.eachWithIndex { key, val, index ->
	def indent = ((index == 0 || index % 2 == 0) ? "   " : "")
	println "Index: $index, Key: $key, Value: $val"
}

for (entry in map) {
	println "KeyName: $entry.key = Value: $entry.value"
}

for(item in listOfThings) {
	println item
}

listOfThings.each { println it }

listOfThings.each { thing -> println thing }