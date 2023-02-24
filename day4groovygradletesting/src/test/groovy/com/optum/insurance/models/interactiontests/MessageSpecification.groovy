package com.optum.insurance.models.interactiontests

import com.optum.insurance.models.Fuel
import com.optum.insurance.models.Vehicle
import com.optum.insurance.models.tests.VehicleTest
import spock.lang.Specification

import java.time.LocalDate

class MessageSpecification extends Specification{
    def "Vehicle List Grows when New Vehicle Added"(){
        given:
        MessageService messageService = new MessageService()

        def emailService = Mock(MailService)  // As we are not testing email service, we mocked the emailService
        emailService.sendMail(_,_,_,_) >> true  //This will ensure to return true for any argument passed for sendMail method
        messageService.emailService = emailService

        Message message = new Message(name : "Parameswari", info: "Welcome")
        when:
        messageService.sendActivationMail(message)

        then:

        1*emailService.sendMail("testUser@gmail","admin@admin.com","Your account is activated", "Congratulation now you can login")
    }
}
