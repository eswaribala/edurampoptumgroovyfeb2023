package com.optum.day3grailsinsurance.models

import grails.gorm.services.Service

@Service(PolicyHolder)
interface PolicyHolderService {

    PolicyHolder get(Serializable id)

    List<PolicyHolder> list(Map args)

    Long count()

    void delete(Serializable id)

    PolicyHolder save(PolicyHolder policyHolder)

}