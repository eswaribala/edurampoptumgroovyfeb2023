package com.optum.day3grailsinsurance.models

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DriverServiceSpec extends Specification {

    DriverService driverService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Driver(...).save(flush: true, failOnError: true)
        //new Driver(...).save(flush: true, failOnError: true)
        //Driver driver = new Driver(...).save(flush: true, failOnError: true)
        //new Driver(...).save(flush: true, failOnError: true)
        //new Driver(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //driver.id
    }

    void "test get"() {
        setupData()

        expect:
        driverService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Driver> driverList = driverService.list(max: 2, offset: 2)

        then:
        driverList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        driverService.count() == 5
    }

    void "test delete"() {
        Long driverId = setupData()

        expect:
        driverService.count() == 5

        when:
        driverService.delete(driverId)
        sessionFactory.currentSession.flush()

        then:
        driverService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Driver driver = new Driver()
        driverService.save(driver)

        then:
        driver.id != null
    }
}
