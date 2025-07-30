package com.team5.clothes.dto.common;

import java.util.UUID;

public record WeatherSummaryDto(
    UUID weatherId,
    String skyStatus,
    PrecipitationDto precipitation,
    TemperatureDto temperature
) {}
