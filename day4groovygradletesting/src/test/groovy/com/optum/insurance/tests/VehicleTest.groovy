package com.optum.insurance.tests

import com.optum.insurance.Vehicle
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertNotNull

class VehicleTest {

    static Vehicle vehicle
    @BeforeAll
    static void createVehicleInstance(){
          vehicle=new Vehicle()
    }

    @Test
    void vehicleInstanceExists(){
        assertNotNull(vehicle)
    }

}
