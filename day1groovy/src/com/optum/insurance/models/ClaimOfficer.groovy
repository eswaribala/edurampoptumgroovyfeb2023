package com.optum.insurance.models

import groovy.transform.Canonical
import groovy.transform.TupleConstructor

@Canonical
@TupleConstructor(includeSuperProperties = true)
class ClaimOfficer extends AuthenticatedUser{

    Boolean sanctionAuthority

}
