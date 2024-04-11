package com.med.controller;

import com.med.model.MedPriceEntity;
import com.med.repo.MedPriceRepo;
import com.med.service.MedPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedPriceController {

    @Autowired
    private MedPriceRepo medPriceRepo;

    @Autowired
    private MedPriceService medPriceService;

    @PostMapping("/addMed")
    public void addMedPrice(@RequestBody MedPriceEntity medPrice){
        medPriceService.saveMedPrice(medPrice);
    }


}
