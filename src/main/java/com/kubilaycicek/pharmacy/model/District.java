package com.kubilaycicek.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District extends BaseData {
    private String text;
    private String pharmacy_number;
}
