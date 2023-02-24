package com.optum.day2project.services

import com.optum.day2project.models.Address
import com.optum.day2project.models.Doctor

interface DoctorFacade {
	boolean addDoctor(Doctor doctor)
	List<Doctor> getAllDoctors()
	Doctor getDoctorById(long mobileNo)
	boolean deleteDoctorById(long mobileNo)
	Doctor updateDoctorAddress(long mobileNo,Address address)
	
}
