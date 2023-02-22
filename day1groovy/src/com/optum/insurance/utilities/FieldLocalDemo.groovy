package com.optum.insurance.utilities

import com.optum.insurance.models.Product
import groovy.transform.Field


@Field List<Product> products=[new Product('laptop',3476576),
                     new Product('Mobile',34576),
                     new Product('Tab',3476)]

def sumClaims(){

   println products.sum().price

}

sumClaims()