package hc.services

import hc.models.Address
import hc.models.Doctor


interface DoctorFacade {
	boolean addDoctor(Doctor doctor)
	List<Doctor> getAllDoctors()
	Doctor getDoctorById(long mobileNo)
	boolean deleteDoctorById(long mobileNo)
	Doctor updateDoctorAddress(long mobileNo, Address address)
	long countDoctors()
	
}
