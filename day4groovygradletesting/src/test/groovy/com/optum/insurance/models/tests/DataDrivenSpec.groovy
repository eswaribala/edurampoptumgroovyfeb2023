package com.optum.insurance.models.tests

import spock.lang.Specification

class DataDrivenSpec extends Specification{

    def "#product.name has #cost"() {
        expect:
        product.getCost() == cost

        where:
        product                   || cost
        new Product(name: "Laptop")  || "65000"
        new Product(name: "Tablet") || "20000"
    }

    static class Product {
        String name
        String getCost() {
            name == "Laptop" ? 65000 : 500
        }
    }
}
