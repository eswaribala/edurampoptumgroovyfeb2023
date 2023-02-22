package com.optum.insurance.utilities

import com.optum.insurance.models.Address
import com.optum.insurance.models.Gender
import com.optum.insurance.models.PolicyHolder

import java.time.LocalDate


List<PolicyHolder> policyHolders=new ArrayList<PolicyHolder>()
List<Address> addressList=new ArrayList<Address>();
addressList.add(new Address("8d","8th Street","Chennai","TN"))
addressList.add(new Address("18d","18th Street","Bangalore","KN"))
for(def i : 1..100){

    policyHolders.add(new PolicyHolder(new Random().nextInt(10000), LocalDate.of(2015,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1), LocalDate.of(2020,new Random().nextInt(10)+1,
            new Random().nextInt(26)+1),
            "PH"+new Random().nextInt(1),
            new Random().nextInt(1000000), Gender.FEMALE,
            addressList,
            "Param@gmail.com",9952032862L))

}

println "${policyHolders.size()}"
println("Before Sorting................")
policyHolders.each {println "${it.policyNo}->${it.addressList.get(0).city}"
       }

//policyHolders sorting

policyHolders.sort{p1,p2 -> p1.policyNo .compareTo(p2.getPolicyNo())}
println("After Sorting................")
policyHolders.each {println "${it.policyNo}->${it.addressList.get(0).city}"
}