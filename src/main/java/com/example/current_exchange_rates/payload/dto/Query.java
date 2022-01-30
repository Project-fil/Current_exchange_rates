package com.example.current_exchange_rates.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {

    @JsonProperty("apikey")
    private String apiKey;

    @JsonProperty("base_currency")
    private String baseCurrency;

    @JsonProperty("timestamp")
    private Timestamp timestamp;

}