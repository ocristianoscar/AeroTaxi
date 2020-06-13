package com.company.View;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;
import com.company.Controller.AdminController;
import com.company.Controller.CancelarVueloController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class CancelarVueloView implements View {

    private CancelarVuelo cancelarVuelo;
    private CancelarVueloController cancelarVueloController;

    public CancelarVueloView(CancelarVuelo cancelarVuelo, CancelarVueloController cancelarVueloController) {
        this.cancelarVuelo = cancelarVuelo;
        this.cancelarVueloController = cancelarVueloController;
        cancelarVuelo.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {

    }
}
