package com.optum.insurance.models

import groovy.transform.Canonical

@Canonical class AuthenticatedUser {
    String userName
    String password
}
