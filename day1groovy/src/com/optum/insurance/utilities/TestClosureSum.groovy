package com.optum.insurance.utilities

import com.optum.insurance.models.Product

class TestClosureSum {

    public static void main(args){
       def products=[new Product('laptop',3476576),new Product('laptop',3476578)]
        //closure
        println products.sum().price

    }
}
