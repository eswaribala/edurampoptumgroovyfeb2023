package com.optum.insurance.utilities

import com.optum.insurance.models.Gender

import java.time.LocalDate

def policyHolder=[7257524526, LocalDate.of(2015,1,1), LocalDate.of(2020,1,1),
                  845848, "Parameswari", Gender.FEMALE,"Chennai",9952032862,"Param@gmail.com"]

//iteration
//for(def policyHolderValue in policyHolder){
 //   println "${policyHolderValue}"
//}

policyHolder.add(true)

//closure
policyHolder.each{item->println(item)}
println "List Size ${policyHolder.size()}"