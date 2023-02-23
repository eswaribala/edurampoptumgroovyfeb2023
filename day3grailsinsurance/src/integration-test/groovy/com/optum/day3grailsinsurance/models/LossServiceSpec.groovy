package com.optum.day3grailsinsurance.models

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class LossServiceSpec extends Specification {

    LossService lossService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Loss(...).save(flush: true, failOnError: true)
        //new Loss(...).save(flush: true, failOnError: true)
        //Loss loss = new Loss(...).save(flush: true, failOnError: true)
        //new Loss(...).save(flush: true, failOnError: true)
        //new Loss(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //loss.id
    }

    void "test get"() {
        setupData()

        expect:
        lossService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Loss> lossList = lossService.list(max: 2, offset: 2)

        then:
        lossList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        lossService.count() == 5
    }

    void "test delete"() {
        Long lossId = setupData()

        expect:
        lossService.count() == 5

        when:
        lossService.delete(lossId)
        sessionFactory.currentSession.flush()

        then:
        lossService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Loss loss = new Loss()
        lossService.save(loss)

        then:
        loss.id != null
    }
}
