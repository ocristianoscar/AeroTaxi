package com.company.View;

import com.company.App.Admin;
import com.company.Controller.AdminController;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.util.Scanner;

public class AdminView implements View {

    private Admin admin;
    private AdminController adminController;

    private static String titulo= "MENU DE ADMINISTRADOR - salidas del sistema";
    private static String op1= "Lista de todos los vuelos programados para una fecha dada ";
    private static String op2= "Lista de todos los clientes";

    public AdminView(Admin admin, AdminController adminController) {
        this.admin = admin;
        this.adminController = adminController;
        admin.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n1 - " + op1 + "\n2 - " + op2);
        String choice = sc.nextLine();

        adminController.execute(choice);
    }
}
