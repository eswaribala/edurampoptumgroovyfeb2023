package com.optum.insurance.services

import com.optum.insurance.facades.VehicleFacade
import com.optum.insurance.helpers.DBHelper
import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import groovy.sql.Sql


import java.sql.SQLException
import java.time.LocalDate
/*
@Grapes([
        @Grab(group='org.slf4j', module='slf4j-api', version='1.6.1'),
        @Grab(group='ch.qos.logback', module='logback-classic', version='0.9.28')
])
import org.slf4j.*
import groovy.util.logging.Slf4j
*/
class VehicleService implements VehicleFacade{


    Sql sqlInstance
    ResourceBundle resourceBundle
    Boolean status
    Vehicle vehicle
    List<Vehicle> vehicleList
    public VehicleService(){
        resourceBundle=ResourceBundle.getBundle("db")
        vehicleList=new ArrayList<Vehicle>()
      //  log.info 'Simple sample to show log field is injected.'
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
        int result
        try {
            sqlInstance.executeInsert query, params
            result=sqlInstance.updateCount
        }
        catch(SQLException ex){

            println ex.getMessage()
        }
        finally{
            sqlInstance.close()
        }

        if(result>0)
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
                vehicle.dateOfRegistration= LocalDate.parse(resultSet.getString(3))
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
