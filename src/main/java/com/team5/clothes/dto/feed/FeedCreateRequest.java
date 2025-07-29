package com.team5.clothes.dto.feed;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public record FeedCreateRequest(
    @NotNull(message = "작성자 ID는 필수입니다.")
    UUID authorId,

    UUID weatherId,

    @NotEmpty(message = "의상 목록은 비어있을 수 없습니다.")
    List<UUID> clothesIds,

    String content
) {}
