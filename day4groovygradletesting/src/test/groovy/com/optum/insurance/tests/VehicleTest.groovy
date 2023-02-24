package com.optum.insurance.tests

import com.optum.insurance.Vehicle
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import java.time.LocalDate

import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertNotEquals
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

    @ParameterizedTest
    @ValueSource(strings = [ "2017-12-27", "2000-11-12", "2020-11-04","2022-01-15","1995-03-27","1975-08-12","2002-04-19" ])
    void vehicleExpiryTest(String dor) {

        vehicle.setDateOfRegistration(LocalDate.parse(dor))
       assertFalse((LocalDate.now().getYear()-vehicle.dateOfRegistration.getYear())>15)
    }

}
