package com.optum.insurance.utilities

import java.util.regex.Pattern

//find assertion
assert "Insurance Claim Management" =~ /Claim/

assert "Insurance Claim Management File No 25342556 found" =~ /.*\d{8}.*/

def pattern= ~/.*\d{8}.*/

assert pattern instanceof Pattern

def data="Insurance Claim Management File No 25342556 found"

assert data =~ pattern

def namePattern = ~ /[a-zA-Z]{5,25}/

def name="Parameswari"

assert name =~ namePattern