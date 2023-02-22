package com.optum.insurance.models

import groovy.transform.Canonical
import groovy.transform.TupleConstructor

import java.time.LocalDate

@Canonical

class Customer extends AuthenticatedUser{
    Long contactNo
    String email
    LocalDate dob
}
