package com.company.Controller;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;
import com.company.MVC.Controller;

public class AdminController implements Controller {

    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //TODO administracion de aviones
                return true;
            case "2":
                //TODO salidas del sistema
                return true;
            default: break;
        }
        return false;
    }
}
