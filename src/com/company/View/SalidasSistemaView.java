package com.company.View;

import com.company.App.SalidasSistema;
import com.company.Controller.SalidasSistemaController;
import com.company.MVC.View;

import java.util.Scanner;

public class SalidasSistemaView implements View {

    private SalidasSistema salidasSistema;
    private SalidasSistemaController salidasSistemaController;

    private static String titulo= "SALIDAS DE SISTEMA";

    @Override
    public void modelChanged() {

    }

    private void show(){
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n");
        //aqui se debe dar a elegir una fecha y mostrar los vuelos que haya para esa fecha
        //también se pueden listar todos los clientes indicando datos personales, categoría
        //del mejor avion utilizado y el total gastado en todos sus vuelos


        //String choice = sc.nextLine();
        //TODO salidasSistemaController.execute(choice);
    }
}
