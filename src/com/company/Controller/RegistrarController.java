package com.company.Controller;

import com.company.App.CancelarVuelo;
import com.company.App.Registrar;
import com.company.MVC.Controller;

public class RegistrarController implements Controller {

    private Registrar registrar;

    public RegistrarController(Registrar registrar) {
        this.registrar = registrar;
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
}
