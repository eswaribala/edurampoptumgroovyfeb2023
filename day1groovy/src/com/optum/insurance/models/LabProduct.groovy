package com.optum.insurance.models

import groovy.transform.Canonical

import java.time.LocalDate


@Canonical class LabProduct {
    String name
    BigDecimal price
    LocalDate dop

    public Product(String name,BigDecimal cost,LocalDate dop){
        this.name=name
        this.price=cost
        this.dop=dop
    }
    public Product(BigDecimal cost){
        this.price=cost
    }
    //operator overloading
    Product plus(Product other){
        new Product(this.price+other.price)
    }
}
