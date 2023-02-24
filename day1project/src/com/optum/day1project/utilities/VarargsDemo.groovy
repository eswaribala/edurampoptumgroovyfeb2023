package com.optum.day1project.utilities

//method 
//function expression
//variable no of arguments
//varargs will be last parameter
//closure with varargs
def populateData= {
	int employeeId, String... skills->
	skills.join(",")
	print "$employeeId=>$skills\n"
}

//without closure
def populateDataV1(int employeeId, String... skills) {
	skills.join(",")
	print "$employeeId=>$skills\n"
}
populateData(1)
populateData(2,"C#")
populateData(3,"C#","Java")
populateData(4,"C#","Java","Python","Groovy")
populateDataV1(1)
populateDataV1(2,"C#")
populateDataV1(3,"C#","Java")
populateDataV1(4,"C#","Java","Python","Groovy")