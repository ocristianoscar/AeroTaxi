package com.company.View;

import com.company.App.Login;
import com.company.App.User;
import com.company.Controller.LoginViewController;
import com.company.Controller.UserViewController;
import com.company.MVC.View;

import java.util.Scanner;

public class UserView implements View {

    private User user;
    private UserViewController userViewController;

    private static String titulo= "MENU DEL USUARIO";
    private static String op1= "1.Contratar vuelo";
    private static String op2= "2.Cancelar vuelo";

    public UserView(UserViewController userViewController, User user) {
        this.userViewController = userViewController;
        this.user = user;
        user.addView(this);
    }
    @Override
    public void modelChanged() { show(); }

    public void show(){
        System.out.print(titulo  +"\n\n" + op1 + "\n" + op2 + "\n\nElija una opción: ");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.next();
        userViewController.execute(opcion);
    }
}
