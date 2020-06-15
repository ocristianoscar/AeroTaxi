package com.company.View;

import com.company.App.AdminAviones;
import com.company.Controller.AdminAvionesController;
import com.company.MVC.View;

import java.util.Scanner;

public class AdminAvionesView implements View {

    private AdminAviones adminAviones;
    private AdminAvionesController adminAvionesController;

    private static String titulo= "ADMINISTRACIÓN DE AVIONES";
    private static String op1= "Dar de alta un nuevo avión";
    private static String op2= "Dar de baja un avión";

    public AdminAvionesView(AdminAviones adminAviones, AdminAvionesController adminAvionesController) {
        this.adminAviones = adminAviones;
        this.adminAvionesController = adminAvionesController;
        adminAviones.addView(this);
    }

    @Override
    public void modelChanged() {

    }

    public void show(){
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n1 - " + op1 + "\n2 - " + op2);
        String choice = sc.nextLine();
        adminAvionesController.execute(choice);
    }
}
