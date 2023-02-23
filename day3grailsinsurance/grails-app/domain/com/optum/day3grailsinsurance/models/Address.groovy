package com.optum.day3grailsinsurance.models

class Address {

    String doorNo
    String streetName
    String city
    String state
    static belongsTo = [policyHolder: PolicyHolder]
    static constraints = {
        doorNo size: 1..5, blank: false, matches: "[a-zA-z\\d]{1,5}"
        streetName size: 5..50, blank: false
        city size: 5..50, blank: false
        state size: 5..50, blank: false
    }
}
