package hc


import hc.models.Medicine
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.junit.jupiter.params.provider.ValueSource

import static org.junit.jupiter.api.Assertions.assertTrue;
class ParameterizedStringTest {

	def static Medicine medicine
	
	@BeforeAll
	static void initalize() {
	    medicine=new Medicine()
	}
	
	@Test
	@RepeatedTest(5)
	@DisplayName("Medicine Null or not")
	void test() {
		//groovy truth
		assert medicine
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = [ "Dolo", "Amdol", "Brufen" ])
	void hasTexts(String medicineName) {
		medicine.name=medicineName
		assertTrue(medicine.name.toString().length()>0);
	}

	
	@ParameterizedTest
	@CsvFileSource(resources = "medicinedata.csv", numLinesToSkip = 0)
	void testWithCsvFileSource(long id, String name) {
		medicine.name=name
		medicine.medicineId=id
		assert medicine.name;
		assert medicine.medicineId
	}
	
	
	
}
