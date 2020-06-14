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

    //en este punto debe seguirse una serie de pasos:
    //1 - elegir fecha
    //2 - si hay vuelos disponibles, se debe elegir origen
    //3 - elegir destino
    //4 - elegir aviones disponibles
    //5 - elegir si se viaja con acompañantes o no
    //6 - finalmente, mostrar y confirmar vuelo

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
