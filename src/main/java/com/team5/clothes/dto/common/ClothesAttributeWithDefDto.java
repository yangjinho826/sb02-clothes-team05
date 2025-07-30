package com.team5.clothes.dto.common;

import java.util.List;
import java.util.UUID;

public record ClothesAttributeWithDefDto(
    UUID definitionId,
    String definitionName,
    List<String> selectableValues,
    String value
) {}
