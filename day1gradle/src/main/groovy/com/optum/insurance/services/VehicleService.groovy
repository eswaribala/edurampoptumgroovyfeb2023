package com.optum.insurance.services

import com.optum.insurance.facades.VehicleFacade
import com.optum.insurance.models.Vehicle

class VehicleService implements VehicleFacade{
    @Override
    Boolean addVehicle(Vehicle vehicle) {
        return null
    }

    @Override
    List<Vehicle> getAllVehicles() {
        return null
    }

    @Override
    Vehicle getVehicleById(String regNo) {
        return null
    }

    @Override
    Vehicle updateVehicleById(String regNo, String color) {
        return null
    }

    @Override
    Boolean deleteVehicleById(String regNo) {
        return null
    }
}
