package com.company.View;

import com.company.App.Login;
import com.company.Controller.LoginViewController;
import com.company.MVC.View;

import java.util.Scanner;

public class LoginView implements View {

    private static String titulo= "MENU DE ACCESO DE USUARIO"
    private static String op1= "usuario: "
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
        private String user = sc.nextLine();
        System.out.print(op2);
        private String pass = sc.nextLine();


        loginViewController.execute(user, pass);
    }

    public void modelChanged(){ show(); }
}
