package com.company.Controller;

import com.company.App.Login;
import com.company.Domain.CapaDatos;
import com.company.MVC.Controller;
import com.company.Model.Usuario;
import com.company.View.AdminView;
import com.company.View.LoginView;

import java.util.ArrayList;
import java.util.List;

public class LoginViewController implements Controller {

    private Login login;
    private AdminView adminView;

    public LoginViewController(Login login) {
        this.login = login;
    }



    //si es usuario lo manda al menu de usuario
    //si es admin lo manda al menu de admin
    @Override
    public boolean execute(String command) {
        String user = command;

        if (login.getUser().isEmpty()){
            List<Usuario> arrayUser  = new ArrayList<>();
            arrayUser = CapaDatos.getUsersList();
            for (Usuario usuario: arrayUser
            ) {

                if (usuario.getUser() == user){
                    login.setUser(user);//Error extra;o en el set, user permanece vacio.

                }
            }
            if (login.getUser().isEmpty()){
                System.out.println("Usuario inexistente, ingrese nuevamente.");
                login.changed();
            }
        }else {

            String pass = command;
            List<Usuario> arrayUser  = new ArrayList<>();
            arrayUser = CapaDatos.getUsersList();
            for (Usuario usuario: arrayUser
            ) {
                if (usuario.getPass() == pass){
                    login.setPass(pass);
                    Usuario.getUsuario(usuario.getUser(), usuario.getPass());
                }
            }
            if (login.getPass().isEmpty()){
                System.out.println("Contraseña incorrecta, ingrese nuevamente.");
            }
        }
        return true;
    }
}
