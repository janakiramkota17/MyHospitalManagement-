package com.med.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MedPriceEntity {

    @Id
    private int medicineId;
    private String medicines;
    private double price;
	public MedPriceEntity() {
		super();
	}
	public MedPriceEntity(int medicineId, String medicines, double price) {
		super();
		this.medicineId = medicineId;
		this.medicines = medicines;
		this.price = price;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MedPriceEntity [medicineId=" + medicineId + ", medicines=" + medicines + ", price=" + price + "]";
	}
    
    
}
