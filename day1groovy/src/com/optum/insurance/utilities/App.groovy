package com.optum.insurance.utilities

//This is script to test groovy application
/*
@author Parameswari
@date 21/02/2023


println "Rocking with groovy...."
//method1
println "Enter Policy No"
policyNo=System.in.newReader().readLine();

//method 2
def readln = javax.swing.JOptionPane.&showInputDialog

def fromDate= readln 'Enter From Date'

//method 3
Scanner scanner=new Scanner(System.in)

toDate=scanner.nextLine()

nameOfTheInsured = readln 'Enter Name of the Insured?'


println policyNo.class.name
println fromDate.class.name
println nameOfTheInsured.class.name

println "Policy No ${policyNo}"
println "From Date ${fromDate}"
 */
insuredAmount=new Random().nextInt(100).plus(1000)
println "Insured Amount = ${insuredAmount}"

def description='''Date, Time, Speed, Exact Place Where loss occurred, Place to which the vehicle was 
heading before the accident, Purpose for which vehicle was used at the time of accident, 
Number of people travelling at time of accident, is it reported to the Police, Name of the Police station, 
FIR No, Statement of how the Accident / Theft occurre'''

println """ Description = ${description}"""
//multi line accepted
pattern=/
[a-zA-Z]*/

println "${pattern}"