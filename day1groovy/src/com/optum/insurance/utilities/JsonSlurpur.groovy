package com.optum.insurance.utilities

import groovy.json.JsonSlurper


def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText('{ "name": "Laptop" } /* some comment */')

assert object instanceof Map
assert object.name == 'Laptop'




