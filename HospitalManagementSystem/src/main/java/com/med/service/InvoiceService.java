package com.med.service;

import com.med.model.MedPriceEntity;
import com.med.model.MedicineEntity;
import com.med.repo.MedPriceRepo;
import com.med.repo.MedicinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private MedicinesRepo medicinesRepo;

    @Autowired
    private MedPriceRepo medPriceRepo;

    public double generateInvoice(int visitingId){
        double total = 0;

        MedicineEntity medicineEntity = medicinesRepo.findByVisitingId(visitingId);
        List<String> selectedMeds = medicineEntity.getMedicines();

        for(String medicine:selectedMeds){
            MedPriceEntity medPriceEntity = medPriceRepo.findByMedicines(medicine);

            if(medPriceEntity!=null){
                total+=medPriceEntity.getPrice();
            }
        }

        return total;
    }
}
