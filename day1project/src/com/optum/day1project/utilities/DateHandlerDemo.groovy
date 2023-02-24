package com.optum.day1project.utilities;

//date
import java.util.GregorianCalendar as D

accountOpenDate=new D(2022,0,20).time
println "Account Opened Date $accountOpenDate"

//current date and time
println new Date()

import groovy.time.TimeCategory

//print date after 10 days
use(groovy.time.TimeCategory){
	println 10.days.from.now
	println accountOpenDate.plus(10.days)
}

//predefine the format
import java.text.SimpleDateFormat
println "Enter Date of Appointment"
doa=System.in.newReader().readLine();
pattern="yyyy-MMM-dd"
//string to date conversion
println new SimpleDateFormat(pattern).parse(doa)



