package com.optum.insurance.utilities

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import java.time.LocalDate
List<Vehicle> vehicles=new ArrayList<Vehicle>()
int count=0
new File("F:\\groovyoptumfeb2023\\day1gradle\\src\\main\\resources\\Vehicle.csv").withReader { reader ->;
    reader.eachLine { line ->

        count++
        if(count>1)
        {
            String[] lineArr=line.split(",");
            // LocalDate.parse(lineArr[2])
          vehicles.add(new Vehicle(lineArr[0],lineArr[1],LocalDate.parse(lineArr[2]),lineArr[3],lineArr[4],
                   Fuel.valueOf(lineArr[5]),lineArr[6]))
        }
    }
}

vehicles.each {println it}