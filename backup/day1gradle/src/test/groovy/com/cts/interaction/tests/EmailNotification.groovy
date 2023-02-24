package com.cts.interaction.tests

import spock.lang.Specification

class EmailNotification extends Specification{
	def "account activation mail sent to user"(){
		setup:
		UserService userService = new UserService()

		def emailService = Mock(EmailService)  // As we are not testing email service, we mocked the emailService
		emailService.sendMail(_,_,_,_) >> true  //This will ensure to return true for any argument passed for sendMail method
		userService.emailService = emailService
		 
		User user = new User(email : "testUser@gmail")
		 
		when:
		userService.sendActivationMail(user)
		 
		then:
		1*emailService.sendMail("testUser@gmail","admin@admin.com","Your account is activated", "Congratulation now you can login")
		 
		}
}
