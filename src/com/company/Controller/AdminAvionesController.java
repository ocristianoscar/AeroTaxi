package com.company.Controller;

import com.company.App.AdminAviones;
import com.company.MVC.Controller;

public class AdminAvionesController implements Controller {

    private AdminAviones adminAviones;

    public AdminAvionesController(AdminAviones adminAviones) {
        this.adminAviones = adminAviones;
    }

    @Override
    public boolean execute(String command) {

        switch (command){
            case "1":
                //TODO dar de alta un avion
                return true;
            case "2":
                //TODO dar de baja un avion
                return true;
            default: break;
        }

        return false;
    }
}
