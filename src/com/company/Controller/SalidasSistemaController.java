package com.company.Controller;

import com.company.App.SalidasSistema;
import com.company.MVC.Controller;

public class SalidasSistemaController implements Controller {

    private SalidasSistema salidasSistema;

    public SalidasSistemaController(SalidasSistema salidasSistema) {
        this.salidasSistema = salidasSistema;
    }

    @Override
    public boolean execute(String command) {

        //aqui se debe dar a elegir una fecha y mostrar los vuelos que haya para esa fecha
        //también se pueden listar todos los clientes indicando datos personales, categoría
        //del mejor avion utilizado y el total gastado en todos sus vuelos

        return false;
    }
}
