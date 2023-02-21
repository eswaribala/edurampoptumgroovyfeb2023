package com.optum.insurance.utilities

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle

import java.time.LocalDate

def vehicleMap=[1:new Vehicle("TN-32-24679","Honda",
        LocalDate.of(2020,1,1),
        "234234","2454325", Fuel.Diesel,"Blue"),
        2:new Vehicle("AP-32-24679","Hyundai", LocalDate.of(2022,1,1),
                "234235","2454326", Fuel.Petrol,"Black")]


//closure
vehicleMap.each {println(it.key)
println(it.value.maker)}
