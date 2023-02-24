package com.optum.day1project.utilities;

//20 employees information
import java.util.Random
def numbers=1..100
for(def emp:numbers)
	print new Random().nextInt(1000)+"\t"

println("\n")	

import java.time.Month
def monthRange=Month.JANUARY..Month.DECEMBER
for(def month : monthRange)
{
	
	print month
	print "\t"
}
import java.time.LocalTime
def timeRange = LocalTime.now()..LocalTime.now().plusSeconds(2)
for (def time : timeRange) {
	println time
}
