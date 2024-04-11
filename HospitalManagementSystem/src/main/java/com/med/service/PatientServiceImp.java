package com.med.service;

import com.med.model.PatientEntity;
import com.med.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PatientServiceImp implements PatientService{

    @Autowired
    private PatientRepo repo;

    @Override
    public void savePatient(@RequestBody PatientEntity patient) {
        repo.save(patient);
    }

    

}
