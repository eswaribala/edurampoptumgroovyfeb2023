package com.optum.insurance.services

import com.optum.insurance.facades.VehicleFacade
import com.optum.insurance.helpers.DBHelper
import com.optum.insurance.models.Vehicle
import groovy.sql.Sql

class VehicleService implements VehicleFacade{

    Sql sqlInstance
    ResourceBundle resourceBundle
    Boolean status
    public VehicleService(){
        resourceBundle=ResourceBundle.getBundle("db")
    }

    public Boolean generateTable(){

        sqlInstance= DBHelper.getConnection()
        def query=resourceBundle.getString("createVehicleTable")
        status=sqlInstance.execute(query)
        sqlInstance.close()

       return status
    }

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
