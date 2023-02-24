package com.optum.day1project.utilities

 
public class JavaConfig {
	public static void main(String[] args) throws MalformedURLException {
		// Read in 'config.groovy' for the development environment.
		ConfigObject conf = new ConfigSlurper("development").parse(new File("config.groovy").toURI().toURL());
		 
		// Read in 'mail.groovy'.
		final ConfigObject mailConf = new ConfigSlurper().parse(new File("mail.groovy").toURI().toURL());
		 
		// Merge both configurations into one.
		conf = (ConfigObject) conf.merge(mailConf);
		 
		// Flatten configuration for easy access keys with dotted notation.
		final Map config = conf.flatten();
		 
		assert "1.0".equals(config.get("app.version"));
		assert new Integer(20).equals(config.get("app.setting2"));
		assert new Date().after((Date) config.get("app.date"));
		assert config.get("app.active");
		assert "http://localhost".equals(config.get("server.URL"));
		assert "smtpservername".equals(config.get("mail.smtp.host"));
	}
}