package com.optum.insurance.utilities

import com.optum.insurance.models.Address
import com.optum.insurance.models.Gender
import com.optum.insurance.models.LabProduct
import com.optum.insurance.models.PolicyHolder
import com.optum.insurance.models.Product

import java.time.LocalDate
def productMap=new Hashtable<Long, Product>()


for(def i:1..100){
    productMap.put(new Random().nextInt(10000)+1, new LabProduct("name"+i,new Random().nextInt(1000000)+1,
            LocalDate.of(2020,new Random().nextInt(10)+1,new Random().nextInt(25)+1)))
}

productMap.each {println(it.key)
println(it.value)}
import groovy.json.JsonOutput
def productInfo=new JsonOutput().toJson(productMap)
prettyData=JsonOutput.prettyPrint(productInfo)
File file=new File('products.json')
file.write(prettyData)
print "File Created"

