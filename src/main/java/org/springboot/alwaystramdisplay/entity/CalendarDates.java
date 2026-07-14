package org.springboot.alwaystramdisplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "calendar_dates")
@Entity
@Data
public class CalendarDates {
    @Id
    @Column(name = "service_id", nullable = false)
    private String serviceId;

    @Id
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "exception_type", nullable = false)
    private Integer exceptionType;
}
