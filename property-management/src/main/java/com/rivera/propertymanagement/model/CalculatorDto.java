package com.rivera.propertymanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CalculatorDto(Double a, @JsonProperty("bbb") Double b, Double c) {

}
