package com.optum.insurance.models

import groovy.transform.Canonical

import java.time.LocalDate

@Canonical class PolicyHolder {

    Long policyNo;
    LocalDate fromDate;
    LocalDate toDate;
    String name;
    Long sumInsured;
    Gender gender
    //one to many
    List<Address> addressList
    String email
    Long contactNo

}
