package com.med.repo;

import com.med.model.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends CrudRepository<PatientEntity,Integer> {
}
