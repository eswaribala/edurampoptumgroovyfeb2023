package com.optum.insurance.utilities

import groovy.xml.XmlParser

def productsData=new XmlParser().parse(new File("F:\\groovyoptumfeb2023\\day1gradle\\src\\main\\resources\\product.xml"))
productsData.Product.each {
    println "Product Name= ${it.Name}"
}