package com.optum.insurance.utilities

import groovy.xml.XmlParser
import groovy.xml.XmlSlurper
File file=new File("F:\\groovyoptumfeb2023\\day1gradle\\src\\main\\resources\\product.xml")
def productsData=new XmlParser().parse(file)
productsData.Product.each {
    println "Product Name= ${it.Name}"
}

def xml = new XmlSlurper().parse(file)

xml.each {
    println "${it}"
}