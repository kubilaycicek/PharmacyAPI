package com.kubilaycicek.pharmacy.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DutyPharmacyRequest implements Serializable {
    private String city;
    private String district;
}
