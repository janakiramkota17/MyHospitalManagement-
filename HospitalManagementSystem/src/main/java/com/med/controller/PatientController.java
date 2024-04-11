package com.med.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.med.model.MedicineEntity;
import com.med.model.PatientEntity;
import com.med.service.InvoiceService;
import com.med.service.MedicineServiceImp;
import com.med.service.PatientRecordsService;
import com.med.service.PatientServiceImp;

@Controller
public class PatientController {

    @Autowired
    private PatientServiceImp serviceImp;

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private MedicineServiceImp medicineServiceImp;
    
    @Autowired
    private PatientRecordsService patientRecordsService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/addPatient")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String patientDetails(PatientEntity patient){
        serviceImp.savePatient(patient);
        return "success";
    }

    @GetMapping("/docpresc")
    public String medicines(){
        return "consultDoc";
    }

    @RequestMapping("/medicalList")
    public String medicalDetails(MedicineEntity medicine) {
        medicineServiceImp.saveMed(medicine);
        return "medicinessuccess";
    }


    @GetMapping("/bill")
    public String generateBillPage() {
        return "invoice";
    }

    @PostMapping("/generateBill")
    public String generateBill(@RequestParam("visitingId") int visitingId, Model model) {
        double totalAmount = invoiceService.generateInvoice(visitingId);
        model.addAttribute("visitingId", visitingId);
        model.addAttribute("totalAmount", totalAmount);
        return "generatedinvoice";
    }
    
    @GetMapping("/patient_details")
    public String getPatinetRecords(ModelMap model)
    {
          model.put("patient", patientRecordsService.getRecords());

         return "patientRecords"; 
    	
    }


}
