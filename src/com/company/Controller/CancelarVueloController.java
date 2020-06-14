package com.company.Controller;

import com.company.App.CancelarVuelo;
import com.company.MVC.Controller;
import com.company.Model.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CancelarVueloController implements Controller {

    private CancelarVuelo cancelarVuelo;

    private List<Vuelo> vuelos = new ArrayList<>();
    public CancelarVueloController(CancelarVuelo cancelarVuelo) {
        this.cancelarVuelo = cancelarVuelo;
    }
    public List<Vuelo> on(LocalDate date) {
        return vuelos.stream()
                .filter(vuelo -> vuelo.isOn(date))
                .collect(Collectors.toList());
    }


    //este controlador debería ver si el usuario tiene o no vuelos
    //si tiene vuelos, debe listarlos y permitir que el usuario elija uno
    //si no tiene vuelos, debe informarlo

    @Override
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
