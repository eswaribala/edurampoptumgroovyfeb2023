package com.optum.insurance.utilities

//This is script to test groovy application
/*
@author Parameswari
@date 21/02/2023
 */

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