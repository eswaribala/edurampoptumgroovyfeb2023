package com.optum.day1project.utilities

import groovy.transform.Field
/*
 * The annotated variable will become a private field of the script class.
 * The type of the field will be the same as the type of the variable. 
 * Example usage
 */
@Field List awe = [1, 2, 3]
//List awe = [1, 2, 3]
def awesum() { awe.sum() }
assert awesum() == 6