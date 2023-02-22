package com.optum.insurance.models

import groovy.transform.Canonical

@Canonical class Product {
    String name
    BigDecimal price
    public Product(String name,BigDecimal cost){
        this.name=name
        this.price=cost
    }
     public Product(BigDecimal cost){
         this.price=cost
     }
    //operator overloading
    Product plus(Product other){
        new Product(this.price+other.price)
    }
}

