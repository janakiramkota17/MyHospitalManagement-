package com.med.repo;

import com.med.model.MedPriceEntity;
import com.med.model.MedicineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedPriceRepo extends CrudRepository<MedPriceEntity,Integer> {
    MedPriceEntity findByMedicines(String medicine);
}


