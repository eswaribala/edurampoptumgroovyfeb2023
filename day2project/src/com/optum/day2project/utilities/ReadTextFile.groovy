package com.optum.day2project.utilities
def filePath="src/com/optum/day2project/resources/db.properties"
new File("src/com/optum/day2project/resources", 'db.properties').eachLine { line ->
	println line
}

def is = new File("src/com/optum/day2project/resources/db.properties").newInputStream()
is.eachLine { 
    println it
}
is.close()

File file = new File(filePath)
def lines = file.readLines()
println "$lines"

file = new File(filePath)
def line, noOfLines = 0;
file.withReader { reader ->
	while ((line = reader.readLine()) != null) {
		println "${line}"
		noOfLines++
	}
}

