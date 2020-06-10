package com.company.Controller;

import com.company.App.ContratarVuelo;
import com.company.Model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContratarVueloController {
    private List<Vuelo> vuelos = new ArrayList<>();

    private ContratarVuelo contratarVuelo;

    public ContratarVueloController(ContratarVuelo contratarVuelo) {
        this.contratarVuelo = contratarVuelo;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //TODO:
                return true;
            case "2":
                //TODO:
                return true;
            case "3":
                //TODO:
                return true;
            case "4":
                //TODO:
                return true;
            case "5":
                //TODO:
                return true;
            default: break;
        }
        return false;
    }

    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public List<Vuelo> on(LocalDate date) {
        return vuelos.stream()
                .filter(vuelo -> vuelo.isOn(date))
                .collect(Collectors.toList());
    }
}
