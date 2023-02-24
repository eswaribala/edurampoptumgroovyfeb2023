package com.optum.day3sbinsurance.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(["metaClass"])
class UserEntity {

    String name

    int age

}
