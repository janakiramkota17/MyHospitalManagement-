package com.med.service;

import com.med.model.MedPriceEntity;
import com.med.repo.MedPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedPriceService implements MedPriceServiceInterface {

    @Autowired
    private MedPriceRepo medPriceRepo;


    @Override
    public void saveMedPrice(MedPriceEntity medPrice) {
        medPriceRepo.save(medPrice);
    }
}
