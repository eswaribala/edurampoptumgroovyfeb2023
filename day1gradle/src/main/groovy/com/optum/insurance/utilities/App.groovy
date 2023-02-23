package com.optum.insurance.utilities

import com.optum.insurance.helpers.DBHelper
import com.optum.insurance.services.VehicleService
import groovy.transform.Field

@Field VehicleService vehicleService=new VehicleService()

def generateTable(){
    vehicleService.generateTable()
}

println "Table Generated Status ${generateTable()}"