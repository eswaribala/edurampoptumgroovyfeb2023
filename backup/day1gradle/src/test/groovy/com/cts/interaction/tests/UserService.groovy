package com.cts.interaction.tests

class UserService {
	def emailService
	
   void sendActivationMail(User user){
	   emailService.sendMail(user.email,"admin@admin.com","Your account is activated", "Congratulation now you can login")
	
	 }
}
