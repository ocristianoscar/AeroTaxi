package com.company.View;

import com.company.App.Login;
import com.company.Controller.LoginViewController;
import com.company.MVC.View;
import com.company.Model.Usuario;
import com.company.Model.Vuelo;
import com.company.Controller.AdminController;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LoginView implements View {

    private static String titulo= "MENU DE ACCESO DE USUARIO";
    private static String op1= "usuario: ";
    private static String op2= "contraseña: ";

    private Login login;
    private LoginViewController loginViewController;
    private AdminController adminController;    /*TODO:esta la cree para poder usar su método para traer
    usuarios, en realidad esto debería ser un método de la capa de persistencia*/

    public LoginView(LoginViewController loginViewController, Login login) {
        this.loginViewController = loginViewController;
        this.login = login;
        login.addView(this);
    }

    public void show(){

        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n" + op1);
        String user = sc.nextLine();

        Usuario usuario = esUser(user);

        if(usuario != null){      //TODO:debe ser un try?
            System.out.print(op2);
            boolean flag = false;
            do {
                String pass = sc.nextLine();
                if (pass == usuario.getPassword()) {
                    flag=true;
                    loginViewController.execute("success");
                } else {
                    System.out.println("Password incorrecto, vuelva a intentarlo");
                }
            }while(!flag);
        }else{
            System.out.println("Usuario no encontrado, vuelva a ingresarlo.");
            this.show();
        }

    }

    public void modelChanged(){ show(); }


    private Usuario esUser(String user){
        Usuario usuarioRegistrado = buscarUsuarioEnLista(user);
        return usuarioRegistrado;
    }

    //TODO: debe buscar en la lista de usuarios y comprobar si es uno registrado
    private Usuario buscarUsuarioEnLista(String user){

        List<Usuario> usuarios = adminController.TraerListaDeClientesEnElArchivo();

        Usuario usuario = new Usuario();

        //TODO:aqui hay que crear algo parecido a esta función pero para levantar el user correcto
        //la funciones está copiada de buscar el vuelo por fecha, es para dar una idea
        /*usuario = vuelos.stream()
                .filter(vuelo -> vuelo.isOn(fecha))
                .collect(Collectors.toList());*/
        return usuario; //este sería el usuario registrado
    }
}
