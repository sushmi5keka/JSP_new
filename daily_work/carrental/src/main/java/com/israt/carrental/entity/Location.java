package com.israt.carrental.entity;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "district",nullable = false)
    private String district;

    @Column(name = "thana")
    private String thana;


}
