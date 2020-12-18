package com.kubilaycicek.pharmacy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy extends BaseData {
    private String name;
    private String dist;
    private String address;
    private String phone;
    private String loc;
}
