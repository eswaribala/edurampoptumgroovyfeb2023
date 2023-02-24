package com.optum.day3project.utilities

import com.optum.day3project.models.Doctor
import com.optum.day3project.services.DoctorFacade
import com.optum.day3project.services.DoctorService
import com.optum.day3project.models.Gender
class HealthCarApp {
	def static void main(String[] args) {
		DoctorFacade doctorFacade=new DoctorService()
		new DoctorService().getAllTables()
		
		//doctorFacade.addDoctor(getDoctorInfo())
		
	  // def count=doctorFacade.countDoctors()
	  // println "Max=$count"
				
		getDoctors()		
	}
	
	def static Doctor getDoctorInfo() {
		def doctor=new Doctor()
		doctor.mobileNo=9952032851
		doctor.firstName="Vignesh"
		doctor.lastName="Bala"
		doctor.gender=Gender.MALE
		println "$doctor.gender"
		doctor.email="vigneshbala@gmail.com"
		doctor.regNo="TN48587"
		doctor.addressList
		return doctor
	}
	
	def static getDoctors() {
		List<Doctor> doctorList=new DoctorService().getAllDoctors()
		doctorList.forEach { t ->
			println "$t"
		}
	}
}
