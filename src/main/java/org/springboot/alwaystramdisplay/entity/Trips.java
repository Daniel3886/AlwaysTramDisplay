package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "trips")
@Entity
@Data
public class Trips {
    @Id
    @Column(name = "trip_id", nullable = false)
    private String tripId;

    @Column(name = "route_id", nullable = false)
    private String routeId;

    @Column(name = "service_id", nullable = false)
    private String serviceId;

    @Column(name = "trip_headsign")
    private String tripHeadsign;

    @Column(name = "trip_short_name")
    private String tripShortName;

    @Column(name = "direction_id")
    private Integer directionId;

    @Column(name = "shape_id")
    private String shapeId;

    @Column(name = "wheelchair_accessible")
    private Integer wheelchairAccessible;
}
