package com.optum.insurance.models

import groovy.transform.Canonical

@Canonical class ClaimOfficer extends AuthenticatedUser{

    Boolean sanctionAuthority

}
