package com.optum.day3project.helpers
import groovy.sql.Sql
class DBHelper {
	
	def static Sql getConnection() {
		
		Properties properties=new Properties();
		File propertyFile=new File(getPropertyFileName())
		propertyFile.withInputStream { properties.load(it) }
		
		println properties.url
		
		def sql = Sql.newInstance(properties.url, properties.userName, properties.password,
			properties.driverClassName)
	   return sql
	
	}
	
	def static String getPropertyFileName() {
		return "./src/com/optum/day3project/resources/db.properties"
	}
}
