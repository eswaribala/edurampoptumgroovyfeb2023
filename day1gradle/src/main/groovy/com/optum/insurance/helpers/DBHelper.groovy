package com.optum.insurance.helpers

import groovy.sql.Sql


class DBHelper {


  def static Sql getConnection(){


    def resourceBundle = ResourceBundle.getBundle("db");
    def userName = resourceBundle.getString("userName");
    def password = resourceBundle.getString("password");
    def url = resourceBundle.getString("url");
    def driverClassName=resourceBundle.getString("driverClassName")

    //db connection
    return Sql.newInstance(url, userName,password, driverClassName)

  }



}
