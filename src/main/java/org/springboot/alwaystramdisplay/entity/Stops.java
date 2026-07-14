package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "stops")
@Entity
@Getter
@Setter
public class Stops {
    @Id
    @Column(name = "stop_id", nullable = false)
    private String stopId;

    @Column(name = "stop_name", nullable = false)
    private String stopName;

    @Column(name = "stop_lat", nullable = false)
    private Double stopLat;

    @Column(name = "stop_lon", nullable = false)
    private Double stopLon;

    @Column(name = "stop_code")
    private String stopCode;
}
