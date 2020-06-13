package com.company.View;

import com.company.App.Admin;
import com.company.App.Registrar;
import com.company.Controller.AdminController;
import com.company.Controller.RegistrarController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class RegistrarView implements View {

    private Registrar registrar;
    private RegistrarController registrarController;

    public RegistrarView(Registrar registrar, RegistrarController registrarController) {
        this.registrar = registrar;
        this.registrarController = registrarController;
        registrar.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {

    }

}
