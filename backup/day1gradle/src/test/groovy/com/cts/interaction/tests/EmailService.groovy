package com.cts.interaction.tests

class EmailService {
	def asynchronousMailService
	
   public sendMail(String to, String from, String subject, String body) {
	   try {
		 asynchronousMailService.sendAsynchronousMail {
		   to to
		   subject subject
		   body to
		   from from
		 }
	   }
	   catch (Throwable t) {
		 log.error("Exception while sending email to user ${to}, Exception is ${t.getStackTrace()}")
	   }
	 }
}
