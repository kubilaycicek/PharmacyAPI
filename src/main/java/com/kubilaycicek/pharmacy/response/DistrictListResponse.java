package com.kubilaycicek.pharmacy.response;

import com.kubilaycicek.pharmacy.model.District;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistrictListResponse extends BaseResponse {
    private List<District> result;
}