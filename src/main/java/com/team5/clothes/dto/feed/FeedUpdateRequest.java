package com.team5.clothes.dto.feed;

import jakarta.validation.constraints.NotBlank;

public record FeedUpdateRequest(
    @NotBlank(message = "피드 내용은 비어있을 수 없습니다.")
    String content
) {}
