package com.optum.day1project.utilities

// Booleans:
def b1 = false
def b2 = true
assert !b1 : "Failed"
assert b2  :"Data Failed"
 
// Strings:
def s1 = null
def s2 = 'abc'
assert !s1 //is empty
assert s2 //non empty
 
// Numbers:
def n1 = 0
def n2 = 42
assert !n1 //is value 0
assert n2 //is value not zero
 
// Lists, iterators:
def l1 = []
def l2 = [1, 3, 6]
assert !l1
assert l2
def i1 = l1.iterator()
def i2 = l2.iterator()
assert !i1
assert i2
 
// Maps:
def m1 = [:]
def m2 = ['key': 'value']
assert !m1
assert m2
 
// Objects:
def o1
def o2 = new Expando(name: 'groovy')
assert !o1
assert o2
 
// Matchers:
def ma1 = "groovy" =~ /java/
def ma2 = "groovy" =~ /groovy/
assert !ma1
assert ma2

if (true) assert true
else assert false
if (1) {
println "Number has value"
} else {
println "Number is not having value"
}
if ('non-empty') assert true
else if (['x']) assert false
else assert false
if (0) assert false
else if ([]) assert false
else assert true

switch (10)
{
   case 0 : assert false ; break
   case 0..9 : assert false ; break
   case [8,9,11] : assert false ; break
   case Float : assert false ; break
   case {it%3 == 0}: assert false ; break
   case ~/../ : assert true ; break
   default : assert false ; break
}



def a = 1
def log = ''
switch (a) {
case 0 : log += '0'
case 1 : log += '1'
case 2 : log += '2' ; break
default : log += 'default'
}
assert log == '12'
