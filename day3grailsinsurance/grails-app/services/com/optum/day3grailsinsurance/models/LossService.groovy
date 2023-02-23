package com.optum.day3grailsinsurance.models

import grails.gorm.services.Service

@Service(Loss)
interface LossService {

    Loss get(Serializable id)

    List<Loss> list(Map args)

    Long count()

    void delete(Serializable id)

    Loss save(Loss loss)

}