package com.optum.day3grailsinsurance.models

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PolicyHolderServiceSpec extends Specification {

    PolicyHolderService policyHolderService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new PolicyHolder(...).save(flush: true, failOnError: true)
        //new PolicyHolder(...).save(flush: true, failOnError: true)
        //PolicyHolder policyHolder = new PolicyHolder(...).save(flush: true, failOnError: true)
        //new PolicyHolder(...).save(flush: true, failOnError: true)
        //new PolicyHolder(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //policyHolder.id
    }

    void "test get"() {
        setupData()

        expect:
        policyHolderService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<PolicyHolder> policyHolderList = policyHolderService.list(max: 2, offset: 2)

        then:
        policyHolderList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        policyHolderService.count() == 5
    }

    void "test delete"() {
        Long policyHolderId = setupData()

        expect:
        policyHolderService.count() == 5

        when:
        policyHolderService.delete(policyHolderId)
        sessionFactory.currentSession.flush()

        then:
        policyHolderService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        PolicyHolder policyHolder = new PolicyHolder()
        policyHolderService.save(policyHolder)

        then:
        policyHolder.id != null
    }
}
