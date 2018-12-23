package com.israt.carrental.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booked")
public class Booked {

    @Column(name = "car_name", unique = true,nullable = false)
    private String carName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "number_of_pessenger", unique = true)
    private int numberOfPessenger;

    @Column(name = "from_location")
    private String fromLocation;

    @Column(name = "to_location")
    private String toLocation;

    @Column(name = "date" )
    private Date date;

    @Column(name = "total_cost", unique = true)
    private int totalCost;
}
