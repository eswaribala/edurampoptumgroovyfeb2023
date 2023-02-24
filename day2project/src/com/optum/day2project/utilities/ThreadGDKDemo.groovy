package com.optum.day2project.utilities

Thread.start { 
	4.times { 
		Thread.currentThread().setName("Optum"+new Random().nextInt(10))
		println "Running Thread name $Thread" 
		println Thread.currentThread().alive
		println Thread.currentThread().name
	}
}
Thread.start {
	12.times {
		Thread.currentThread().setName("Eduramp"+new Random().nextInt(10))
		println "Running Thread name $Thread"
		println Thread.currentThread().alive
		println Thread.currentThread().name
	}
}