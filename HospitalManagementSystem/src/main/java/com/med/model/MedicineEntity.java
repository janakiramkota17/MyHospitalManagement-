package com.med.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MedicineEntity {


    @Id
    private int visitingId;
    private int patientId;

    @ElementCollection
    private List<String> medicines;

	public MedicineEntity() {
		super();
	}

	public MedicineEntity(int visitingId, int patientId, List<String> medicines) {
		super();
		this.visitingId = visitingId;
		this.patientId = patientId;
		this.medicines = medicines;
	}

	public int getVisitingId() {
		return visitingId;
	}

	public void setVisitingId(int visitingId) {
		this.visitingId = visitingId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "MedicineEntity [visitingId=" + visitingId + ", patientId=" + patientId + ", medicines=" + medicines
				+ "]";
	}
    
    


}
