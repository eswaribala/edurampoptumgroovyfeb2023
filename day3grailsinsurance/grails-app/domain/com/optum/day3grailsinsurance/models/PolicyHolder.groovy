package com.optum.day3grailsinsurance.models

import java.time.LocalDate

class PolicyHolder {

    Long policyNo
    Date fromDate
    Date toDate
    String insuredName
    Gender gender
    Date dob
    Long phoneNo
    String email
    static belongsTo = [vehicle: Vehicle]
    static hasMany = [addresses:Address]
    static constraints = {
        policyNo blank: false, unique: true
        insuredName size: 5..50, blank: false
        phoneNo  blank: false, matches: "\\d{10}"
        email size: 25..255, blank: false,email: true

    }
}
