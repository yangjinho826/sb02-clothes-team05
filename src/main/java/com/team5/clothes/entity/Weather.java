package com.team5.clothes.entity;

import com.team5.clothes.converter.JsonbConverter;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "weather")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "forecasted_at")
    private Timestamp forecastedAt;

    @Column(name = "forecast_at")
    private Timestamp forecastAt;

    @Column(name = "location", columnDefinition = "jsonb")
    @Convert(converter = JsonbConverter.class)
    private String location;

    @Column(name = "sky_status", length = 50)
    private String skyStatus;

    @Column(name = "temperature", columnDefinition = "jsonb")
    @Convert(converter = JsonbConverter.class)
    private String temperature;

    @Column(name = "humidity", columnDefinition = "jsonb")
    @Convert(converter = JsonbConverter.class)
    private String humidity;

    @Column(name = "precipitation", columnDefinition = "jsonb")
    @Convert(converter = JsonbConverter.class)
    private String precipitation;

    @Column(name = "wind_speed", columnDefinition = "jsonb")
    @Convert(converter = JsonbConverter.class)
    private String windSpeed;

    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;
}