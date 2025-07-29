package com.team5.clothes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "ootd_feed_items")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OotdFeedItem {
    @EmbeddedId
    private OotdFeedItemId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("feedId")
    @JoinColumn(name = "feed_id")
    private Feed feed;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("clothesId")
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;

    // ootd_feed_items 테이블의 복합키를 위한 클래스
    @Embeddable
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class OotdFeedItemId implements Serializable {
        private UUID feedId;
        private UUID clothesId;
    }
}
