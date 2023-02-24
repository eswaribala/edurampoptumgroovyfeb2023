package com.optum.day1project.utilities

assert "Groovy Training" =~ /Groovy/

assert "Groovy1244 Training" =~ /^Groovy\d{2,4}.*$/

def input="Groovy training is from  8 FEB 2022 to 03 MAR 2022"
def pattern=/\d\d? ... \d{4}/
def matches=(input =~ pattern)

assert matches[0] =~ '8 FEB 2022'
assert matches[1] =~ '03 MAR 2022'

//validate email
def email="Parameswari@gmail.com"
assert email =~ /\S+@\S+\.\S+/

//validate name
def name="Parameswari"

assert name =~ /^[a-zA-Z]{5,25}$/


