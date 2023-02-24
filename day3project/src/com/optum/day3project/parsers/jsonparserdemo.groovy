package com.optum.day3project.parsers
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
//run as java application
if(args.size()<=0)
	println "Not Exists"

fileName=args[0]

println "$fileName"

//json string to json object
jsonObject=new JsonSlurper().parseText('{"customerId":27469,"name":"Rathna"}')
println "$jsonObject.customerId,$jsonObject.name"

//json object to string
def patientInfo=["patientId": 94395,"doa":"2022-03-03","mobileNo":9952032786]
String patientJson=JsonOutput.toJson(patientInfo)
println "Patient Information=${patientJson}"

//check file exists
File file = new File(fileName)
def lines = file.readLines()
//println "$lines"

//reading the json data from file
def users=new JsonSlurper().parse(new File(fileName))
users.each { 
	user->
	println "$user.name,$user.email"
}

fileName=args[1]
def countries=new JsonSlurper().parse(new File(fileName))
countries.each {
	country->
	println "$country.name"
}


