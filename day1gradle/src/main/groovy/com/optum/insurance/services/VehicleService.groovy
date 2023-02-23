package com.optum.insurance.services

import com.optum.insurance.facades.VehicleFacade
import com.optum.insurance.helpers.DBHelper
import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import groovy.sql.Sql


import java.sql.SQLException


class VehicleService implements VehicleFacade{


    Sql sqlInstance
    ResourceBundle resourceBundle
    Boolean status
    Vehicle vehicle
    List<Vehicle> vehicleList
    public VehicleService(){
        resourceBundle=ResourceBundle.getBundle("db")
        vehicleList=new ArrayList<Vehicle>()
    }

    public Boolean generateTable(){

        sqlInstance= DBHelper.getConnection()
        def query=resourceBundle.getString("createVehicleTable")
        //execute will return true only for select statement
        status=sqlInstance.execute(query)
        sqlInstance.close()

       return status
    }

    @Override
    Boolean addVehicle(Vehicle vehicle) {
        sqlInstance= DBHelper.getConnection()

        def query=resourceBundle.getString("addVehicle")

        List<Object> params=new ArrayList<Object>();
        params.add(vehicle.getRegistrationNo())
        params.add(vehicle.getMaker())
        params.add(vehicle.getDateOfRegistration())
        params.add(vehicle.getChassisNo())
        params.add(vehicle.getEngineNo())
        params.add(vehicle.getTypeofFuel().name())
        params.add(vehicle.getColor())
        List<Object> results
        try {
            results=sqlInstance.executeInsert query, params
           // sqlInstance.commit()
        }
        catch(SQLException ex){
           // sqlInstance.rollback()
            println ex.getMessage()
        }
        finally{
            sqlInstance.close()
        }

        if(results.size()>0)
            return true;
        else
            return false;

    }

    @Override
    List<Vehicle> getAllVehicles() {
        sqlInstance= DBHelper.getConnection()

        def query=resourceBundle.getString("getVehicles")
        sqlInstance.query(query) { resultSet ->
            while (resultSet.next()) {
                vehicle=new Vehicle();
                vehicle.registrationNo=resultSet.getString(1)
                vehicle.maker=resultSet.getString(2)
                vehicle.dateOfRegistration=resultSet.getDate(3)
                vehicle.chassisNo=resultSet.getString(4)
                vehicle.engineNo= resultSet.getString(5)
                vehicle.typeofFuel=Fuel.valueOf(resultSet.getString(6))
                vehicle.color=resultSet.getString(7)
                vehicleList.add(vehicle);

            }
        }
        sqlInstance.close()
        return vehicleList
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
