package com.company.View;

import com.company.App.Admin;
import com.company.Controller.AdminController;
import com.company.MVC.View;

import java.time.DayOfWeek;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> Cristian

public class AdminView implements View {

    private Admin admin;
    private AdminController adminController;

<<<<<<< HEAD
=======
    private static String titulo= "MENU DE ADMINISTRADOR";
    private static String op1= "Administración de Aviones";
    private static String op2= "Salidas del Sistema ";

>>>>>>> Cristian
    public AdminView(Admin admin, AdminController adminController) {
        this.admin = admin;
        this.adminController = adminController;
        admin.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
<<<<<<< HEAD

=======
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n1 - " + op1 + "\n2 - " + op2);
        String choice = sc.nextLine();

        adminController.execute(choice);
>>>>>>> Cristian
    }
}
