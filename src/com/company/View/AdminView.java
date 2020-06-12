package com.company.View;

import com.company.App.Admin;
import com.company.Controller.AdminController;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.util.Scanner;

public class AdminView implements View {

    private Admin admin;
    private AdminController adminController;

    private static String titulo= "MENU DE ADMINISTRADOR"
    private static String op1= "Administración de Aviones"
    private static String op2= "Salidas del Sistema ";

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
        private String choice = sc.nextLine();


        adminController.execute(choice);
    }
}
