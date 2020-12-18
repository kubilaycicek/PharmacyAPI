package com.kubilaycicek.pharmacy.controller;

import com.kubilaycicek.pharmacy.request.DistrictListRequest;
import com.kubilaycicek.pharmacy.request.DutyPharmacyRequest;
import com.kubilaycicek.pharmacy.response.DistrictListResponse;
import com.kubilaycicek.pharmacy.response.DutyPharmacyResponse;
import com.kubilaycicek.pharmacy.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/pharmacy")
public class PharmacyController {
    @Autowired
    PharmacyService pharmacyService;

    @GetMapping("/districtList")
    public DistrictListResponse getDistrictListResponse(@RequestBody DistrictListRequest req) {
        return pharmacyService.getDistrictList(req.getCity());
    }

    @GetMapping("/dutyPharmacyByCityAndDistrict")
    public DutyPharmacyResponse getDutyPharmacyByCityAndDistrict(@RequestBody DutyPharmacyRequest req) {
        return pharmacyService.getDutyPharmacy(req.getCity(), req.getDistrict());
    }

    @GetMapping("/dutyPharmacyByCity")
    public DutyPharmacyResponse getDutyPharmacyByCity(@RequestBody DutyPharmacyRequest req) {
        return pharmacyService.getDutyPharmacy(req.getCity());
    }
}