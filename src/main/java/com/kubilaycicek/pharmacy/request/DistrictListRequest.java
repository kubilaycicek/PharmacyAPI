package com.kubilaycicek.pharmacy.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictListRequest implements Serializable {
    private String city;
}
