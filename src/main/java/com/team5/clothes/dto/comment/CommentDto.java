package com.team5.clothes.dto.comment;

import java.time.Instant;
import java.util.UUID;

public record CommentDto(
    UUID id,
    Instant createdAt,
    UUID feedId,
    AuthorDto author,
    String content
) {}