package com.optum.day3project.parsers

import groovy.json.JsonOutput

def medicines=[['medicineId':123,'name':'brufen','dosage':'250mg'],
	['medicineId':124,'name':'amdol','dosage':'500mg'],
	['medicineId':125,'name':'dolo','dosage':'500mg']
	]
	
def medicineInfo=new JsonOutput().toJson(medicines)
prettyData=JsonOutput.prettyPrint(medicineInfo)
File file=new File('medicines.json')
file.write(prettyData)
print "File Created"
