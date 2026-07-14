package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "routes")
@Data
public class Routes {
    @Id
    @Column(name = "route_id", nullable = false)
    private String routeId;

    @Column(name = "agency_id")
    private String agencyId;

    @Column(name = "route_short_name")
    private String routeShortName;

    @Column(name = "route_long_name")
    private String routeLongName;

    @Column(name = "route_desc")
    private String routeDesc;

    @Column(name = "route_type", nullable = false)
    private Integer routeType;

    @Column(name = "route_color")
    private String routeColor;

    @Column(name = "route_text_color")
    private String routeTextColor;
}
