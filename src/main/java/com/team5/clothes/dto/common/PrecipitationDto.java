package com.team5.clothes.dto.common;

public record PrecipitationDto(
    String type,
    Double amount,
    Double probability
) {
}
