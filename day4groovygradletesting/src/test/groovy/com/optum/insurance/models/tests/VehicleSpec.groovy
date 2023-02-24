package com.optum.insurance.models.tests

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import spock.lang.Specification

import java.time.LocalDate

class VehicleSpec extends Specification{

    def "Vehicle List Grows when New Vehicle Added"(){
        given:
        def list = VehicleTest.getData()
        when:
        list.add(new Vehicle("TN-32-24679","Honda", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue"))

        then:

        list.size() > 5
    }

}
