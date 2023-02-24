package com.optum.day2project.services

import com.optum.day2project.models.Address
import com.optum.day2project.models.Doctor

class DoctorService implements DoctorFacade {

	private List<Doctor> doctorList
	private boolean status
	private Doctor doctorObj
	//constructor
	
	
	public DoctorService() {
		//super();
		// TODO Auto-generated constructor stub
		doctorList=new ArrayList()
	}

	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorList.add(doctor);
		status=true
		return status;
	}
	
	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	@Override
	public Doctor getDoctorById(long mobileNo) {
		// TODO Auto-generated method stub
		
		doctorList.forEach { doctor -> 
			if(doctor.mobileNo==mobileNo)
				doctorObj=doctor
		}
		return doctorObj
	}

	@Override
	public boolean deleteDoctorById(long mobileNo) {
		// TODO Auto-generated method stub
		
		doctorList.forEach { doctor ->
			if(doctor.mobileNo==mobileNo)
				doctorObj=doctor
		}
		doctorList.remove(doctorObj)
		status=true
		
		return status;
	}

	@Override
	public Doctor updateDoctorAddress(long mobileNo,Address address) {
		// TODO Auto-generated method stub
		doctorList.forEach { doctor ->
			if(doctor.mobileNo==mobileNo)
				doctorObj=doctor
		}
		//copy
		doctorObj.addressList.add(address);
		//doctorList.add(doctorObj)
		return doctorObj
	}

	
}
