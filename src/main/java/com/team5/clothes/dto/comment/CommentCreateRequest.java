package com.team5.clothes.dto.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public record CommentCreateRequest(
    @NotNull(message = "피드 ID는 필수입니다.")
    UUID feedId,

    @NotNull(message = "작성자 ID는 필수입니다.")
    UUID authorId,

    @NotBlank(message = "댓글 내용은 비어있을 수 없습니다.")
    String content
) {}