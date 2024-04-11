package com.med.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.model.PatientEntity;
import com.med.repo.PatientRepo;

@Service
public class PatientRecordsService {
	
	@Autowired
	private PatientRepo repo;

	public List<PatientEntity> getRecords() {
		// TODO Auto-generated method stub
		return (List<PatientEntity>) repo.findAll();
	}
	
//	public List<PatientEntity> getRecords()
//	{
//		return (List<PatientEntity>) repo.findAll();
//		
//	}

}
