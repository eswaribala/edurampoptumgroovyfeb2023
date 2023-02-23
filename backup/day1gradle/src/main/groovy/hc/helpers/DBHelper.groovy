package hc.helpers
import groovy.sql.Sql
class DBHelper {
	
	def static Sql getConnection() {
		
		Properties properties=new Properties();
		File propertyFile=new File(getPropertyFileName())
		propertyFile.withInputStream { properties.load(it) }
		
		println properties.url
		
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/optumhealthcaredb", "root","vignesh",
			"com.mysql.jdbc.Driver")
	   return sql
	
	}
	
	def static String getPropertyFileName() {
		return "F:\\groovyoptumfeb2023\\day1gradle\\src\\main\\resources\\db.properties"
	}
}
