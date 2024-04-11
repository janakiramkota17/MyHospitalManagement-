package com.med.service;

import com.med.model.MedicineEntity;
import com.med.repo.MedicinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MedicineServiceImp implements MedicinesService{

    @Autowired
    private MedicinesRepo repo;

    @Override
    public void saveMed(MedicineEntity medicine) {
        repo.save(medicine);
    }
}
