package com.optum.insurance.models

import groovy.transform.Canonical

import java.time.LocalDate

@Canonical class Vehicle {

     String registrationNo
     String maker
     LocalDate dateOfRegistration
     String chassisNo
     String engineNo
     Fuel typeofFuel
     String color

}
