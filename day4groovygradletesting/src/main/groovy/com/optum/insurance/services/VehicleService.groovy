package com.optum.insurance.services

import com.optum.insurance.respositories.VehicleRepo

import java.sql.SQLException
import java.util.stream.Collectors

class VehicleService {

    VehicleRepo vehicleRepo
    VehicleService(VehicleRepo vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    List<String> getSelectedVehicles() {
        try {
            return vehicleRepo.getAllVehicles().stream()
                    .filter(vehicle -> vehicle.getDateOfRegistration().getMonth() < 8)
                    .collect(Collectors.toList());
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }
}
