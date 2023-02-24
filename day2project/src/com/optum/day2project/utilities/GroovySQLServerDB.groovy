package com.optum.day2project.utilities
import groovy.sql.Sql
class GroovySQLServerDB {
//Data Source=DESKTOP-55AGI0I\MSSQLEXPRESS2021;
	//Initial Catalog=IntelInventoryDB;Persist Security 
	//Info=True;User ID=sa;Password=***********
	static main(def args)
	{
		def url = 'jdbc:sqlserver://localhost:1433'
		def user = 'sa'
		def password = 'vignesh'
		def driver = 'com.microsoft.sqlserver.jdbc.SQLServerDriver'
		def sql = Sql.newInstance(url, user, password, driver)
		/*
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
			 */
		sql.close()
	}
}
