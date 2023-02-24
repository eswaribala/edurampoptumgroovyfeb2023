package com.optum.insurance.models.interactiontests

class MessageService {
    def emailService

    void sendActivationMail(Message message){
        emailService.sendMail(message.name,"admin@admin.com","Your account is activated", "Congratulation now you can login")

    }
}
