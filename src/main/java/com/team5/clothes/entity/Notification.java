package com.team5.clothes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private User receiver;

    @Column(length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(length = 50)
    private String level;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    public void onCreate(User receiver, String title, String content, String level) {
        this.receiver = receiver;
        this.title = title;
        this.content = content;
        this.level = level;
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }
}