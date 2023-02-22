package com.optum.insurance.utilities

import com.optum.insurance.models.Address
import com.optum.insurance.models.Gender
import com.optum.insurance.models.PolicyHolder

import java.time.LocalDate


def policyHolders=[]
def addressList=[]


for(def i : 1..100){

    policyHolders.add(new PolicyHolder(new Random().nextInt(1000000), LocalDate.of(2015,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1), LocalDate.of(2020,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1),
            "PH"+new Random().nextInt(1),
            new Random().nextInt(1000000), Gender.FEMALE, addressList.add(new Address("8d","street","Chennai","TN")),"Param@gmail.com",9952032862,))

}


