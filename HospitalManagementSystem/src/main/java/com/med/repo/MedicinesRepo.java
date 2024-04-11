package com.med.repo;

import com.med.model.MedicineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinesRepo extends CrudRepository<MedicineEntity,Integer> {
    MedicineEntity findByVisitingId(int visitingId);
}
