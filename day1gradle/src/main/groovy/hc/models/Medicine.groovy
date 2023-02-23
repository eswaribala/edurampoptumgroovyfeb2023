package hc.models

import groovy.transform.Canonical

@Canonical class Medicine {
	def medicineId,name,dosage

	public Medicine(long medicineId, Object name, Object dosage) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.dosage = dosage;
	}

	public Medicine() {

	}
}
