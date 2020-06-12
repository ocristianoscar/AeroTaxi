package com.company.Controller;

import com.company.App.CancelarVuelo;
import com.company.App.ContratarVuelo;
import com.company.MVC.Controller;

public class CancelarVueloController implements Controller {

    private CancelarVuelo cancelarVuelo;

    public CancelarVueloController(CancelarVuelo cancelarVuelo) {
        this.cancelarVuelo = cancelarVuelo;
    }

    //este controlador debería ver si el usuario tiene o no vuelos
    //si tiene vuelos, debe listarlos y permitir que el usuario elija uno
    //si no tiene vuelos, debe informarlo

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
