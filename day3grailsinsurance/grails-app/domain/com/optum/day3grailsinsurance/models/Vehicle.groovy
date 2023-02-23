package com.optum.day3grailsinsurance.models

import java.time.LocalDate

class Vehicle {
    String registrationNo
    String maker
    Date dor
    String chassisNo
    String engineNo
    Fuel fuel
    String color
    static hasOne = [policyHolder: PolicyHolder]
    static constraints = {
        registrationNo size: 10..15, blank: false, unique: true
        maker size: 5..30, blank: false
        chassisNo size: 5..30, blank: false, matches: "[a-zA-Z\\d\\-]{5,30}"
        engineNo size: 5..255, blank: false
        color size: 3..30, blank: false
        policyHolder nullable: true

    }
    String toString() {
        registrationNo
    }
}
