package com.optum.insurance.helpers

import groovy.sql.Sql

class DBHelper {


  def static Sql getConnection(){

    Properties properties=new Properties()
    File propertyFile=new File(getPropertyFileName())
    propertyFile.withInputStream {properties.load(it)}

    //db connection
    return Sql.newInstance(properties.url, properties.userName,properties.password, properties.driverClassName)

  }



  def static String getPropertyFileName(){

     return "F:\\groovyoptumfeb2023\\day2groovy\\src\\com\\optum\\insurance\\resources\\db.properties"
  }

}
