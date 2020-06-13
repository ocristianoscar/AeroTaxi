package com.company.View;

import com.company.App.Admin;
import com.company.App.ContratarVuelo;
import com.company.Controller.AdminController;
import com.company.Controller.ContratarVueloController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class ContratarVueloView implements View {
    private ContratarVuelo contratarVuelo;
    private ContratarVueloController contratarVueloController;

    public ContratarVueloView(ContratarVuelo contratarVuelo, ContratarVueloController contratarVueloController) {
        this.contratarVuelo = contratarVuelo;
        this.contratarVueloController = contratarVueloController;
        contratarVuelo.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {

    }
}
