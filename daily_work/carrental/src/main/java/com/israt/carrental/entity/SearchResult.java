package com.israt.carrental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "searchResult")
public class SearchResult {

    @Column(name = "date" )
    private Date date;

    @Column(name = "time" )
    private String time;
}
