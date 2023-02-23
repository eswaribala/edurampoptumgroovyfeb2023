package com.optum.insurance.utilities

import groovy.xml.XmlParser
import groovy.xml.XmlSlurper
File file=new File("F:\\groovyoptumfeb2023\\day1gradle\\src\\main\\resources\\product.xml")
def productsData=new XmlParser().parse(file)
productsData.Product.each{
    bk->
        print("Product Name:")
        println "${bk.Name[0].text()}"
        print("Product Price:")
        println "${bk.Price[0].text()}"

}

def xml = new XmlSlurper().parse(file)

xml.Product.each {
    println "${it.Name}"
}

