package hc


import hc.models.Medicine
import spock.lang.Specification

class MedicineSpoc extends Specification{

	 def "Test Medicine List Empty or Not"(){
		 
		 given:
		 List<Medicine> medicineList=new ArrayList<Medicine>()
		 
		 when:
		 medicineList.add(new Medicine(214342,"Paracetamol","500mg"))
		 
		 then:
		   assert medicineList.size()>0
	 }
	

	
	}

