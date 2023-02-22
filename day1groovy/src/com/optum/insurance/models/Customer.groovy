package com.optum.insurance.models

import groovy.transform.Canonical
import groovy.transform.TupleConstructor
import lombok.experimental.SuperBuilder

import java.time.LocalDate

@Canonical
class Customer extends AuthenticatedUser{
    Long contactNo
    String email
    LocalDate dob

    Customer(String userName,String password,Long contactNo, String email, LocalDate dob) {
        super(userName,password)
        this.contactNo = contactNo
        this.email = email
        this.dob = dob
    }
}
