package com.optum.insurance.models.interactiontests

import groovy.util.logging.Slf4j


class MailService {

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
            println("Exception while sending email to user ${to}, Exception is ${t.getStackTrace()}")
        }
    }
}
