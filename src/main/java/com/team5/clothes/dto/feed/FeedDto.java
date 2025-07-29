package com.team5.clothes.dto.feed;

import java.time.Instant;
import java.util.UUID;

public record FeedDto(
    UUID id,
    Instant createdAt,
    Instant updatedAt,
    AuthorDto author,
    WeatherSummaryDto weather,
    List<OotdDto> ootds,
    String content,
    Long likeCount,
    Integer commentCount,
    Boolean likedByMe
) {}
