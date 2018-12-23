package com.coder.bd.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "flightSearchControler")
public class FlightSearchControler {

    private FlightSearch flight;

    public FlightSearch getFlight() {

        if (flight == null) {
            flight = new FlightSearch();
        }
        return flight;
    }
}
