package com.team5.clothes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(name = "profile_image_url")
    private String profileImageUrl;

    @Column
    private String gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column
    private String location;

    @Column(name = "temperature_sensitivity")
    private Integer temperatureSensitivity;


}
