package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "stop_times")
@Data
public class StopTimes {
    @Id
    @Column(name = "trip_id", nullable = false)
    private String tripId;

    @Column(name = "arrival_time", nullable = false)
    private String arrivalTime;

    @Column(name = "departure_time", nullable = false)
    private String departureTime;

    @Column(name = "stop_id", nullable = false)
    private String stopId;

    @Column(name = "stop_sequence", nullable = false)
    private Integer stopSequence;
}
