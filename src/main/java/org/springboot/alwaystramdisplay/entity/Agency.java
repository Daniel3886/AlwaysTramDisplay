package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "agency")
@Data
public class Agency {
    @Id
    @Column(name = "agency_id", nullable = false)
    private String agencyId;

    @Column(name = "agency_name", nullable = false)
    private String agencyName;

    @Column(name = "agency_url", nullable = false)
    private String agencyUrl;

    @Column(name = "agency_timezone", nullable = false)
    private String agencyTimezone;

    @Column(name = "agency_phone")
    private String agencyPhone;

    @Column(name = "agency_lang")
    private String agencyLang;
}
