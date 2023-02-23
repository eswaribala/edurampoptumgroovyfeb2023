package com.optum.insurance.facades

import com.optum.insurance.models.Vehicle

interface VehicleFacade {
    //CRUD
    Boolean addVehicle(Vehicle vehicle)
    List<Vehicle> getAllVehicles()
    Vehicle getVehicleById(String regNo)
    Vehicle updateVehicleById(String regNo, String color)
    Boolean deleteVehicleById(String regNo)



}