package com.company.Controller;

import com.company.App.*;
import com.company.MVC.Controller;
import com.company.View.CancelarVueloView;
import com.company.View.ContratarVueloView;
import com.company.View.LoginView;
import com.company.View.RegistrarView;

import java.util.Scanner;

public class UserViewController implements Controller {

    private User user;

    public UserViewController(User user){ this.user = user; }


    @Override
    public boolean execute(String command) {
        switch (command){
            case "1":
                //Contratacion de vuelo
                ContratarVuelo contratarVuelo = new ContratarVuelo();
                ContratarVueloController contratarVueloController= new ContratarVueloController(contratarVuelo);
                ContratarVueloView contratarVueloView = new ContratarVueloView(contratarVuelo, contratarVueloController);
                contratarVueloView.show();
                return true;
            case "2":
                //cancelacion de vuelo
                CancelarVuelo cancelarVuelo = new CancelarVuelo();
                CancelarVueloController cancelarVueloController= new CancelarVueloController(cancelarVuelo);
                CancelarVueloView cancelarVueloView = new CancelarVueloView(cancelarVuelo, cancelarVueloController);
                cancelarVueloView.show();
                return true;
            case "3":
                //Desloggear
            default:
                System.out.println("Opcion no disponible\nVuelva a ingresar valor: ");
                Scanner sc = new Scanner(System.in);
                String opcion = sc.next();
                this.execute(opcion);
        }
        return false;
    }
}
