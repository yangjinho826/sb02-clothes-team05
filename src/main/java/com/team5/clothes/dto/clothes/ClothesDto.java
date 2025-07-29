package com.team5.clothes.dto.clothes;

import com.team5.clothes.domain.clothes.enums.ClothesType;
import java.util.UUID;

public record ClothesDto(
    UUID id,
    UUID ownerId,
    String name,
    String imageUrl,
    ClothesType type,
    List<ClothesAttributeWithDefDto> attributes
) {}
