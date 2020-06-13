package com.company.Controller;

import com.company.App.ContratarVuelo;
import com.company.MVC.Controller;
import com.company.Model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContratarVueloController implements Controller {
    private List<Vuelo> vuelos = new ArrayList<>();

    private ContratarVuelo contratarVuelo;

    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

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
}
