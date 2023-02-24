package com.optum.day1project.utilities
import groovy.json.JsonBuilder
import groovy.json.JsonGenerator
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')

assert object instanceof Map
assert object.name == 'John Doe'

def jsonSlurper1 = new JsonSlurper()
def object1 = jsonSlurper1.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

assert object1 instanceof Map
assert object1.myList instanceof List
assert object1.myList == [4, 8, 15, 16, 23, 42]
import java.time.LocalDate
class Person {
	String name
	String title
	int age
	String password
	LocalDate dob
	URL favoriteUrl
}

Person person = new Person(name: 'John', title: null, age: 21, password: 'secret',
							dob: LocalDate.of(1984, 12, 2),
							favoriteUrl: new URL('http://groovy-lang.org/'))

def generator = new JsonGenerator.Options()
	.excludeNulls()
	.dateFormat('yyyy@MM')
	.excludeFieldsByName('age', 'password')
	.excludeFieldsByType(URL)
	.build()

assert generator.toJson(person) == '{"name":"John","dob":"1984@12"}'

def json = JsonOutput.toJson([name: 'John Doe', age: 42])

assert json == '{"name":"John Doe","age":42}'

assert JsonOutput.prettyPrint(json) == '''\
{
    "name": "John Doe",
    "age": 42
}'''.stripIndent()


JsonBuilder builder = new JsonBuilder()
builder.records {
  car {
		name 'HSV Maloo'
		make 'Holden'
		year 2006
		country 'Australia'
		record {
			type 'speed'
			description 'production pickup truck with speed of 271kph'
		}
  }
}
String json1 = JsonOutput.prettyPrint(builder.toString())
import groovy.json.*

def generator12 = new JsonGenerator.Options()
		.excludeNulls()
		.excludeFieldsByName('make', 'country', 'record')
		.excludeFieldsByType(Number)
		.addConverter(URL) { url -> "http://groovy-lang.org" }
		.build()

JsonBuilder builder1 = new JsonBuilder(generator12)
builder1.records {
  car {
		name 'HSV Maloo'
		make 'Holden'
		year 2006
		country 'Australia'
		homepage new URL('http://example.org')
		record {
			type 'speed'
			description 'production pickup truck with speed of 271kph'
		}
  }
}

assert builder1.toString() == '{"records":{"car":{"name":"HSV Maloo","homepage":"http://groovy-lang.org"}}}'
StringWriter writer = new StringWriter()
StreamingJsonBuilder builder2 = new StreamingJsonBuilder(writer)
builder2.records {
	car {
		name 'HSV Maloo'
		make 'Holden'
		year 2006
		country 'Australia'
		record {
			type 'speed'
			description 'production pickup truck with speed of 271kph'
		}
	}
}
String json2 = JsonOutput.prettyPrint(writer.toString())

def generator13 = new JsonGenerator.Options()
.excludeNulls()
.excludeFieldsByName('make', 'country', 'record')
.excludeFieldsByType(Number)
.addConverter(URL) { url -> "http://groovy-lang.org" }
.build()

StringWriter writerrr = new StringWriter()
StreamingJsonBuilder builderrrr = new StreamingJsonBuilder(writerrr, generator)

builderrrr.records {
car {
name 'HSV Maloo'
make 'Holden'
year 2006
country 'Australia'
homepage new URL('http://example.org')
record {
	type 'speed'
	description 'production pickup truck with speed of 271kph'
}
}
}

assert writer.toString() == '{"records":{"car":{"name":"HSV Maloo","homepage":"http://groovy-lang.org"}}}'