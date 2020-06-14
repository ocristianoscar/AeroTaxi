package com.company.View;

import com.company.App.Admin;
import com.company.App.ContratarVuelo;
import com.company.Controller.AdminController;
import com.company.Controller.ContratarVueloController;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.util.Scanner;

public class ContratarVueloView implements View {
    private ContratarVuelo contratarVuelo;
    private ContratarVueloController contratarVueloController;

<<<<<<< HEAD
=======
    private static String titulo= "CONTRATAR VUELO";
    private static String op1= "Elegir fecha: ";
    //private static String op2= "";

>>>>>>> Cristian
    public ContratarVueloView(ContratarVuelo contratarVuelo, ContratarVueloController contratarVueloController) {
        this.contratarVuelo = contratarVuelo;
        this.contratarVueloController = contratarVueloController;
        contratarVuelo.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n" + op1);
        String fecha = sc.next();
        contratarVueloController.execute(fecha);        //acá hay que hacerlo con try, de la misma forma
                                                        //que se hizo en login
        //en este punto debe seguirse una serie de pasos:
        //1 - elegir fecha
        //2 - si hay vuelos disponibles, se debe elegir origen
        //3 - elegir destino
        //4 - elegir aviones disponibles
        //5 - elegir si se viaja con acompañantes o no
        //6 - finalmente, mostrar y confirmar vuelo
    }
}
