package com.company.Controller;

import com.company.Model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VueloController {
    private List<Vuelo> vuelos = new ArrayList<>();

    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public List<Vuelo> on(LocalDate date) {
        return vuelos.stream()
                .filter(vuelo -> vuelo.isOn(date))
                .collect(Collectors.toList());
    }
}
