package com.kubilaycicek.pharmacy.service;

import com.kubilaycicek.pharmacy.response.DistrictListResponse;
import com.kubilaycicek.pharmacy.response.DutyPharmacyResponse;

public interface PharmacyService {
    DutyPharmacyResponse getDutyPharmacy(String city);
    DutyPharmacyResponse getDutyPharmacy(String city, String district);
    DistrictListResponse getDistrictList(String city);
}
