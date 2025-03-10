package com.example.lr20190024.deals.requests;

import com.example.lr20190024.deals.enums.DealStatus;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DealUpdateRequest {
    @Positive
    private Long stageId;
    private String name;
    private DealStatus dealStatus;
}
