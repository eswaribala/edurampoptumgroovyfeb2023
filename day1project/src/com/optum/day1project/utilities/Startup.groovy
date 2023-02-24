package com.optum.day1project.utilities;


/*@Author Parameswari
 *@Version 1.0
 * 
 */
println 'Welcome to Groovy Training'
//find out the data type
customerId=395696
customerName='Parameswari'
active=true
char gender='M'
//wrapper type
println customerId.class.name
println customerName.class.name
println active.class.name
println gender.class.name

println 'CustomerId='+customerId

//read input
println "Enter your mobile No"
mobileNo=System.in.newReader().readLine()

println 'Mobile No='+mobileNo
//def treated as place holder
def readln = javax.swing.JOptionPane.&showInputDialog
def orgName = readln 'Enter Organization Name that you are working?'
println "Organization Name = $orgName"

balance=439509.76
amount=4396
//plus is a method / function --> operator overloading
println balance.plus(amount)
//double quote with dollar
println "Amount= $amount"

//Strings
//java string

println 'Amount= $amount' //will not do translation

//Gstring
println "Amount= $amount"// it translates

//Multiple lines
groovydoc='''
Groovy is a well established player in the JVM 
since a few years ago. Its increased popularity 
across the years has spawned several projects 
that conform the Groovy Ecosystem. 
You've probably heard of Grails, Gradle, 
Griffon and Spock. But what about the rest of 
projects that are just waiting around the corner 
to be discovered and make your life easier? 
This talk presents them tools and libraries that 
use Groovy as the main driving force to get the job done.

'''

groovyGstringDoc="""
Groovy is a well established player in the JVM 
since a few years ago. Its increased popularity 
across the years has spawned several projects 
that conform the Groovy Ecosystem. 
You've probably heard of Grails, Gradle, 
Griffon and Spock. But what about the rest of 
projects that are just waiting around the corner 
to be discovered and make your life easier? 
This talk presents them tools and libraries that 
use Groovy as the main driving force to get the job done.

"""

println "$groovydoc"

println groovydoc.class.name
println "$groovyGstringDoc"

println groovyGstringDoc.class.name





