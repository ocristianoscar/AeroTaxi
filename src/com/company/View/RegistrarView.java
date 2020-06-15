package com.company.View;

import com.company.App.Admin;
import com.company.App.Registrar;
import com.company.Controller.AdminController;
import com.company.Controller.RegistrarController;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.util.Scanner;

public class RegistrarView implements View {

    private Registrar registrar;
    private RegistrarController registrarController;

    private static String titulo= "REGISTRO DE USUARIO";
    private static String op1= "nombre: ";
    private static String op2= "apellido: ";
    private static String op3= "DNI: ";
    private static String op4= "edad: ";
    private static String op5= "user: ";
    private static String op6= "pass: ";

    public RegistrarView(Registrar registrar, RegistrarController registrarController) {
        this.registrar = registrar;
        this.registrarController = registrarController;
        registrar.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n" + op1);    //estos son todos los datos que se necesitan
        String nombre = sc.nextLine();
        System.out.print(op2);
        String apellido = sc.nextLine();
        System.out.print(op3);
        String DNI = sc.nextLine();
        System.out.print(op4);
        String edad = sc.nextLine();
        System.out.print(op5);
        String user = sc.nextLine();
        System.out.print(op6);
        String pass = sc.nextLine();

        //TODO registrarController.execute(command);
    }


}
