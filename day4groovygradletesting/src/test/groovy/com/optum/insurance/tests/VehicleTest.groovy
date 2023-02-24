package com.optum.insurance.tests

import com.optum.insurance.Fuel
import com.optum.insurance.Vehicle
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource

import java.time.LocalDate
import java.util.stream.IntStream
import java.util.stream.Stream

import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertNotEquals
import static org.junit.jupiter.api.Assertions.assertNotNull
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.params.provider.Arguments.arguments

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


    @ParameterizedTest
    @MethodSource("generateVehicleData")
    void vehicleRegNoTest(String regNo,String make, String dor) {
        vehicle.setMaker(make)
        vehicle.setRegistrationNo(regNo)
        vehicle.setDateOfRegistration(LocalDate.parse(dor))
        assertTrue(vehicle.getRegistrationNo().startsWith("AP"))

    }

    static Stream<Arguments> generateVehicleData() {

        return Stream.of(
                arguments("TN-31-AK-33424","Honda","2012-05-05"),
                arguments("TN-31-AK-33425","Hyundai","2001-11-09"),
                arguments("TN-31-AK-33426","Suzuki","2020-10-21"),
                arguments("TN-31-AK-33427","Audi","2019-09-21"),


        );
    }



    @ParameterizedTest
    @MethodSource("generateVehicleInstances")
    void vehicleInstanceMakerTest(Vehicle vehicleInstance) {
        vehicle=vehicleInstance
        assertTrue(vehicle.getMaker() != "Maruti")

    }

    static Stream<Arguments> generateVehicleInstances() {

        return Stream.of(
                arguments(new Vehicle("TN-32-24679","Honda", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")),
                arguments(new Vehicle("TN-32-24680","Hyundai", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")),
                arguments(new Vehicle("TN-32-24690","Benz", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")),
                arguments(new Vehicle("TN-32-24697","Toyato", LocalDate.of(2020,1,1), "234234","2454325", Fuel.Diesel,"Blue")),


        );
    }

}
