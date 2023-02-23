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
    vehicle.setRegistrationNo("TN-02-AK-2543")
    vehicle.setMaker("Honda City")
    vehicle.setDateOfRegistration(LocalDate.of(2019,12,7))
    vehicle.setChassisNo("A21468")
    vehicle.setEngineNo('A973612')
    vehicle.setTypeofFuel(Fuel.Diesel)
    vehicle.setColor("Red")
    return vehicleService.addVehicle(vehicle)
}

def getAllVehicles(){
    vehicleService.getAllVehicles().each {println(it)}
}

//getAllVehicles()

println insertVehicleData()