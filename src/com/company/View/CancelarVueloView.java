package com.company.View;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;
import com.company.Controller.AdminController;
import com.company.Controller.CancelarVueloController;
import com.company.MVC.View;
import java.time.DayOfWeek;
import java.util.Scanner;

public class CancelarVueloView implements View {

    private CancelarVuelo cancelarVuelo;
    private CancelarVueloController cancelarVueloController;
    private static String titulo= "CANCELAR VUELO";
    //private static String op1= "Administración de Aviones"
    //private static String op2= "Salidas del Sistema ";
    public CancelarVueloView(CancelarVuelo cancelarVuelo, CancelarVueloController cancelarVueloController) {
        this.cancelarVuelo = cancelarVuelo;
        this.cancelarVueloController = cancelarVueloController;
        cancelarVuelo.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n");
        //aca debería mostrar con el execute ya sea si tiene vuelos para cancelar, como no
        //TODO cancelarVueloController.execute();

        //private String choice = sc.nextLine();
    }
}
