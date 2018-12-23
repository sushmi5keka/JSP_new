package com.israt.carrental.entity;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "car_name",nullable = false)
    private String carName;

    @Column(name = "numbers_of_seat")
    private String numbersOfSeat;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "driver_mobile")
    private String driverMobile;

    @Column(name = "location")
    private String location;

    @Column(name = "rent_cost")
    private String rentCost;




}
