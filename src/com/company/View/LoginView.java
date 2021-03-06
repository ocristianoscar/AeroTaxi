package com.company.View;

import com.company.App.Login;
import com.company.App.User;
import com.company.Controller.LoginViewController;
import com.company.Controller.UserViewController;
import com.company.MVC.View;
import com.company.Model.Usuario;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public void modelChanged(){ show(); }

    public void show(){

        String hasUser = login.getUser();
        if(!hasUser.isEmpty()){
            System.out.print(op2);
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            loginViewController.execute(pass);
            try{
                loginViewController.execute(pass);

            }catch (Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }else {
            if (login.getPass().isEmpty()){
                System.out.print(titulo + "\n\n" + op1);
                Scanner sc = new Scanner(System.in);
                String pass = sc.nextLine();
                try {
                    loginViewController.execute(pass);
                } catch (Exception e) {
                    System.out.println(e.fillInStackTrace());
                }
                if (login.getPass().isEmpty()) {
                    System.out.println("\nAh ocurrido un error en el inicio de sesion.\n");
                    login.setUser(new String());
                    login.setPass(new String());
                }
            }
        }
    }
}
