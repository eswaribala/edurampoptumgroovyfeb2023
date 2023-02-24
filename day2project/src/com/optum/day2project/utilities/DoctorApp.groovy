package com.optum.day2project.utilities
import com.optum.day2project.models.Address
import com.optum.day2project.models.Doctor
import com.optum.day2project.models.Gender
import com.optum.day2project.services.DoctorFacade
import com.optum.day2project.services.DoctorService
class DoctorApp {

	static void main(args) {
		// TODO Auto-generated method stub
		//create object
		def doctor1=new Doctor()
		doctor1.mobileNo=5969879
		doctor1.regNo=93459643
		doctor1.email="Parmeswari@gmail.com"
		doctor1.gender=Gender.FEMALE
		doctor1.firstName="Parameswari"
		doctor1.lastName="Bala"
		doctor1.addressList=new ArrayList()
		doctor1.addressList.add(new Address("2784687","8th street","Chennai","TN"))
		//invoke the service
		DoctorFacade doctorFacade=new DoctorService();
		doctorFacade.addDoctor(doctor1);
		doctorFacade.getAllDoctors().forEach { doctor -> 
			println "$doctor"
		}
		
		
		
	}
}
