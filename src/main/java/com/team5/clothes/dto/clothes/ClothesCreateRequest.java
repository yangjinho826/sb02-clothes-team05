package com.team5.clothes.dto.clothes;

import com.team5.clothes.domain.clothes.enums.ClothesType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public record ClothesCreateRequest(
    @NotNull(message = "소유자 ID는 필수입니다.")
    UUID ownerId,

    @NotBlank(message = "의상 이름은 필수입니다.")
    String name,

    @NotNull(message = "의상 타입은 필수입니다.")
    ClothesType type,

    List<ClothesAttributeDto> attributes
) {}
