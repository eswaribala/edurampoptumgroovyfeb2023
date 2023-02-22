package com.optum.insurance.utilities

import com.optum.insurance.models.AuthenticatedUser
import com.optum.insurance.models.Customer
import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle

import java.time.LocalDate

class InsuranceApp {

    static void main(args){
     def vehicle=new Vehicle("TN-32-24679","Honda", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")
    //def vehicle=new Vehicle()
     println(vehicle.registrationNo)
      println "Vehicle ${vehicle.getRegistrationNo()}"

     def customer=new Customer("param","Test@123",9952032862,"Param",LocalDate.of(1970,12,2))
     println "$customer"

     //runtime polymorphism

        AuthenticatedUser user=customer
        println "$user"

    }
}
