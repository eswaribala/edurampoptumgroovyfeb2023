package com.optum.insurance.utilities

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import groovy.xml.MarkupBuilder

import java.time.LocalDate
def vehicleMap=new Hashtable<Long, Vehicle>()


for(def i:1..100){
    vehicleMap.put(i, new Vehicle("TN-02-AJ001", "Honda",
            LocalDate.of(2020,new Random().nextInt(10)+1,new Random().nextInt(25)+1),"A314324","B4142", Fuel.Petrol,
            "Blue"))
}
def mB = new MarkupBuilder()

// Compose the builder
def VEHICLEDB = mB.vehicles('shelf': 'New Arrivals') {
    vehicleMap.each {
        sd ->
            mB.vehicle() {
                registrationNo(sd.value.registrationNo)
                make(sd.value.maker)
                dor(sd.value.dateOfRegistration)
                chasisno(sd.value.chassisNo)
                engineno(sd.value.engineNo)
                fuel(sd.value.typeofFuel)
                color(sd.value.color)
            }
    }
}