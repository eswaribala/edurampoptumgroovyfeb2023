package com.optum.insurance.utilities

import com.optum.insurance.models.Address
import com.optum.insurance.models.Gender
import com.optum.insurance.models.PolicyHolder

import java.time.LocalDate


List<PolicyHolder> policyHolders=new ArrayList<PolicyHolder>()
List<Address> addressList=new ArrayList<Address>();


for(def i : 1..10){

    policyHolders.add(new PolicyHolder(new Random().nextInt(10000000), LocalDate.of(2015,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1), LocalDate.of(2020,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1),
            "PH"+new Random().nextInt(1),
            new Random().nextInt(1000000), Gender.FEMALE,
            null,
            "Param@gmail.com",9952032862L,))

}

println "${policyHolders.size()}"
for(policyHolder in policyHolders){
    println "${policyHolder}"
}
