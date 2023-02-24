package com.optum.day2project.utilities
import groovy.sql.Sql
class GroovyDB {

	static main(def args)
	{
		def url = 'jdbc:mysql://localhost:3306/nessu'
		def user = 'root'
		def password = 'vignesh'
		def driver = 'com.mysql.jdbc.Driver'
		def sql = Sql.newInstance(url, user, password, driver)
		
		// use 'sql' instance ...
		sql.query('SELECT * FROM employee') { resultSet ->
			while (resultSet.next()) {			  
			  
			  print(resultSet.getString(1))
			  println(resultSet.getString(2))
			}
		  }
	    sql.connection.autoCommit=false
		def sqlstr = """INSERT INTO Project(project_id, project_name) VALUES (1280,'GeoSpace')""" 
		try 
		{
			 sql.execute(sqlstr); 
			 sql.commit()
			  println("Successfully committed")
			   } 
		catch(Exception ex) 
		{ 
			sql.rollback() 
			println("Transaction rollback")
			 }
		sql.close()
	}
}
