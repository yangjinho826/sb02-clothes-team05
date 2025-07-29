package com.team5.clothes.dto.clothes;

import jakarta.validation.constraints.NotBlank;
import java.util.List;

public record ClothesAttributeDefCreateRequest(
    @NotBlank(message = "속성 이름은 필수입니다.")
    String name,
    List<String> selectableValues
) {}

