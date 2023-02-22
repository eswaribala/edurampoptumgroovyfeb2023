package com.optum.insurance.utilities

import com.optum.insurance.models.Product

def products=[new Product('laptop',3476576), new Product('laptop',3476578)]

def displayProductList(ArrayList<Product> products){

    products.each {printf("product %s, name %s price %f", it,it.name,it.price)}

}

def displayProduct(Product product){
   //safety operator
    printf("product %s, name %s price %f", product,product?.name,product?.price)

}
displayProductList(products)
displayProduct(null)