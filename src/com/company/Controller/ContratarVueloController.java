package com.company.Controller;

import com.company.App.ContratarVuelo;
<<<<<<< HEAD
=======
import com.company.MVC.Controller;
>>>>>>> Cristian
import com.company.Model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

<<<<<<< HEAD
public class ContratarVueloController {
=======
public class ContratarVueloController implements Controller {
>>>>>>> Cristian
    private List<Vuelo> vuelos = new ArrayList<>();

    private ContratarVuelo contratarVuelo;

<<<<<<< HEAD
=======
    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

>>>>>>> Cristian
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
<<<<<<< HEAD

    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public List<Vuelo> on(LocalDate date) {
        return vuelos.stream()
                .filter(vuelo -> vuelo.isOn(date))
                .collect(Collectors.toList());
    }
=======
>>>>>>> Cristian
}
