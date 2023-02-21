package com.optum.insurance.utilities

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle

import java.time.LocalDate

class InsuranceApp {

    static void main(args){
      def vehicle=new Vehicle("TN-32-24679","Honda", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")
      println "Vehicle ${vehicle.getRegistrationNo()}"
    }
}
