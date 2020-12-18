package com.kubilaycicek.pharmacy.response;

import com.kubilaycicek.pharmacy.model.Pharmacy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DutyPharmacyResponse extends BaseResponse {
    private List<Pharmacy> result;
}
