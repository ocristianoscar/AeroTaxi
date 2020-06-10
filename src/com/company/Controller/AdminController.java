package com.company.Controller;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;

public class AdminController {

    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
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
