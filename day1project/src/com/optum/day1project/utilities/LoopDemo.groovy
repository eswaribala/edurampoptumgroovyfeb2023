package com.optum.day1project.utilities

def carss = ["BMW", "Mercedes Benz", "Volvo", "Chevrolet", "Ford"]

for (int i = 0; i < carss.size(); i++) {
	println carss[i]
}

@groovy.transform.Canonical
class Cars {
	String brand = ""
	String type = ""
	Integer price = 0
}

List<Cars> cars = [
	[brand: "BMW", type: "750i", price: 300000],
	[brand: "Mercedes Benz", type: "B600", price: 120000],
	[brand: "Volvo", type: "S230", price: 98000]
]

for (car in cars) {
	println "$car.brand $car.type -> $car.price"
}

def carNameArray = ["BMW", "Mercedez Benz", "Volvo"]

for (car in carNameArray) {
	println car
}

for ( i in 0..5 ) {
	println "Line number: $i"
}

def map = ['BMW': 300000, 'Mercedez Benz': 200000, 'Volvo': 90000]

for ( m in map ) {
	println "$m.key -> $m.value"
}

def map2 = ['BMW': 300000, 'Mercedez Benz': 200000, 'Volvo': 90000]

for ( m2 in map2.values() ) {
	println m2
}

def carsss = ["BMW", "Mercedez Benz", "Volvo"]
def x = 0

while ( x < carsss.size() ) {
	println(carsss[x])
	x++
}


List<Cars> carsy = [
	[brand: "BMW", type: "750i", price: 300000],
	[brand: "Mercedes Benz", type: "B600", price: 120000],
	[brand: "Volvo", type: "S230", price: 98000]
]

carsy.each {
	println "$it.brand $it.type -> $it.price"
}


