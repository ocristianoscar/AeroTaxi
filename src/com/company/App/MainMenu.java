package com.company.App;

import com.company.Domain.Fecha;
import com.company.MVC.Model;

public class MainMenu extends Model {

    private Fecha fechaActual;

    public MainMenu(Fecha fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Fecha getFechaActual() { return fechaActual; }
}
