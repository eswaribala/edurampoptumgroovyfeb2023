package com.optum.insurance.utilities

import com.optum.insurance.helpers.DBHelper
import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import com.optum.insurance.services.VehicleService
import groovy.transform.Field

import java.time.LocalDate

@Field VehicleService vehicleService=new VehicleService()

def generateTable(){
    vehicleService.generateTable()
}

def Boolean insertVehicleData(){
    def vehicle=new Vehicle()
    vehicle.setRegistrationNo("TN-02-AJ-2549")
    vehicle.setMaker("Hyundai I10")
    vehicle.setDateOfRegistration(LocalDate.of(2019,12,7))
    vehicle.setChassisNo("A21467")
    vehicle.setEngineNo('A973699')
    vehicle.setTypeofFuel(Fuel.Diesel)
    vehicle.setColor("Blue")
    return vehicleService.addVehicle(vehicle)
}

println "Data Generated Status ${insertVehicleData()}"