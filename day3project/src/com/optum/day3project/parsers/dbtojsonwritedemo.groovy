package com.optum.day3project.parsers

import com.optum.day3project.models.Doctor
import com.optum.day3project.services.DoctorService
import groovy.json.JsonOutput

class DBToJSON{
	static void main(String[] args) {
		//read from DB
		List<Doctor> doctors=new DoctorService().getAllDoctors()
		//create key pair value
		Map map=new HashMap()
		doctors.forEach{
			doctor ->
			map.put("mobileNo", doctor.mobileNo)
			map.put("firstName", doctor.firstName)
			map.put("lastName", doctor.lastName)
			map.put("regNo", doctor.regNo)
		}
		println "$map"
		def doctorInfo=new JsonOutput().toJson(map)
		def doctorPrettyData=JsonOutput.prettyPrint(doctorInfo)
		File file=new File('doctors.json')
		file.write(doctorPrettyData)
		print "File Created"
	}
}
	
