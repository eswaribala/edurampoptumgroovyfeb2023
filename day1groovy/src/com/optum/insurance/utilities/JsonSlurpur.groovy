package com.optum.insurance.utilities

import com.optum.insurance.models.Product
import groovy.json.JsonSlurper


def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText('{ "name": "Laptop" , "price":4385834} /* some comment */')
println "$object"
def product=new Product(object.name,object.price)
assert object instanceof Map
assert object.name == 'Laptop'



//check file exists
File file = new File("users.txt")
def lines = file.readLines()
println "$lines"
