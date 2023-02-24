package com.optum.insurance.respositories

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle

import java.time.LocalDate

class VehicleRepo {

    List<Vehicle> getAllVehicles(){

        List<Vehicle> vehicleList=new ArrayList<Vehicle>()
        for(def i : 1..100){
            vehicleList.add(new Vehicle("TN-32-24679"+String.valueOf(i),"Honda",
                    LocalDate.of(2020,new Random().nextInt(10)+1,new Random().nextInt(25)+1), "234234","2454325",
                    Fuel.Diesel,"Blue"))

        }
        return vehicleList
    }
}
