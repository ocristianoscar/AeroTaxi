package com.company.View;

import com.company.App.Login;
import com.company.Controller.LoginViewController;
import com.company.MVC.View;

import java.util.Scanner;

public class LoginView implements View {

    private static String titulo= "MENU DE ACCESO DE USUARIO";
    private static String op1= "usuario: ";
    private static String op2= "contraseña: ";

    private Login login;
    private LoginViewController loginViewController;

    public LoginView(LoginViewController loginViewController, Login login) {
        this.loginViewController = loginViewController;
        this.login = login;
        login.addView(this);
    }

    public void show(){

        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n" + op1);
        String user = sc.nextLine();
        if(loginViewController.execute(user)){      //debe ser un try

            System.out.print(op2);
            String pass = sc.nextLine();
            loginViewController.execute(pass);
        }

    }

    public void modelChanged(){ show(); }
}
