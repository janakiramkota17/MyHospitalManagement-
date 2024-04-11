package com.med.service;

import com.med.model.MedicineEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface MedicinesService {
    public void saveMed(MedicineEntity medicine);
}
