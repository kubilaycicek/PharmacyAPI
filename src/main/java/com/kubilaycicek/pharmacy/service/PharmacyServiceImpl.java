package com.kubilaycicek.pharmacy.service;

import com.kubilaycicek.pharmacy.response.DistrictListResponse;
import com.kubilaycicek.pharmacy.response.DutyPharmacyResponse;
import com.kubilaycicek.pharmacy.util.HeaderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PharmacyServiceImpl implements PharmacyService {

    private final RestTemplate restTemplate;

    @Override
    public DutyPharmacyResponse getDutyPharmacy(String city) {
        return restTemplate.exchange("https://api.collectapi.com/health/dutyPharmacy?il=" + city,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), DutyPharmacyResponse.class).getBody();
    }

    @Override
    public DutyPharmacyResponse getDutyPharmacy(String city, String district) {
        return restTemplate.exchange("https://api.collectapi.com/health/dutyPharmacy?ilce=" + district + "&il=" + city,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), DutyPharmacyResponse.class).getBody();
    }

    @Override
    public DistrictListResponse getDistrictList(String city) {
        return restTemplate.exchange("https://api.collectapi.com/health/districtList?il=" + city,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), DistrictListResponse.class).getBody();
    }
}