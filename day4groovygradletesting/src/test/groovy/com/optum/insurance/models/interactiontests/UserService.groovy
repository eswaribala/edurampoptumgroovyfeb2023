package com.optum.insurance.models.interactiontests

class UserService {
	def emailService
	
   void sendActivationMail(User user){
	   emailService.sendMail(user.email,"admin@admin.com","Your account is activated", "Congratulation now you can login")
	
	 }
}
