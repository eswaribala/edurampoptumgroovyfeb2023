package com.optum.insurance.utilities

import groovy.transform.Field


@Field def claims=[[486874, "Claim1", true], [486875, "Claim2", false]]

def sumClaims(){
    sum=0
    claims.each {x->
        {
            sum+=x[0]
            println $sum
        }

    }

}

sumClaims()