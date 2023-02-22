package com.optum.insurance.models

import groovy.transform.Canonical
import groovy.transform.TupleConstructor
import lombok.experimental.SuperBuilder

@Canonical

class AuthenticatedUser {
    String userName
    String password

}
