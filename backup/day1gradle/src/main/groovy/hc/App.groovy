package hc


import groovy.sql.Sql

import hc.helpers.DBHelper

class App {
	static void main(String[] args) {
		Sql conn= DBHelper.getConnection()
		
		//DoctorFacade doctorFacade=new DoctorService()
		//new DoctorService().getAllTables()
		

	}
}
