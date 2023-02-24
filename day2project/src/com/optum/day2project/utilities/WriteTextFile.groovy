package com.optum.day2project.utilities

def baseDir="src/com/optum/day2project/resources"
new File(baseDir,'diagnosisreport.txt').withWriter('utf-8') { writer ->
	writer.writeLine 'Diagonized with root canal issue'
	writer.writeLine 'Upper Molar to be fixed'
	writer.writeLine 'Fix the Appointment'
}