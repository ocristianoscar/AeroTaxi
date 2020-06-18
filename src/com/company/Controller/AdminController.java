package com.company.Controller;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;

import com.company.Domain.Fecha;
import com.company.MVC.Controller;
import com.company.Model.Usuario;
import com.company.Model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdminController implements Controller {

    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //TODO lista de todos los vuelos programados para una fecha dada

                LocalDate fecha = ingresarFecha();      //la fecha en la que se deben listar los vuelos

                List<Vuelo> vuelos = new ArrayList();   //TODO: esta sería la lista desde donde se levantan los vuelos
                                                        //o sea, la lista de persistencia

                //aqui se devuelve una lista con todos los vuelos de la lista principal en la fecha seleccionada
                //y se almacena en la lista vuelosEnFecha

                List<Vuelo> vuelosEnFecha = vuelos.stream()
                                            .filter(vuelo -> vuelo.isOn(fecha))
                                            .collect(Collectors.toList());

                //luego se muestra un mensaje de que no hay vuelos o se muestran los vuelos

                if(vuelosEnFecha.isEmpty()){
                    System.out.print("No hay vuelos en la fecha seleccionada");
                }else{
                    System.out.print("LISTA DE VUELOS EN LA FECHA " + fecha + "\n\n");
                    for(Vuelo vuelo : vuelosEnFecha){
                        mostrarVuelo(vuelo);
                    }
                }
                return true;

            case "2":
                //TODO lista de clientes, indicando datos personales, categoría más alta de vuelo contratada
                // y total de gastos en vuelos

                /*si se muestran todos los clientes ordenados por apellido habría que ordenarlos quizá
                antes de subirlos a la lista. Si se los muestra ordenados por id, directamente se los lee
                como están en la lista*/

                List<Usuario> clientes = new ArrayList();   //TODO:esta es la lista de clientes, que debería ser
                                                            //levantada del archivo de persistencia

                if(clientes.isEmpty()){
                    System.out.print("No hay clientes para mostrar");
                }else{
                    System.out.print("LISTA DE CLIENTES\n\n");
                    for(Usuario cliente : clientes){
                        mostrarCliente(cliente);
                    }
                }

                //metodo "mostrarCliente(Usuario usuario)"

                return true;
            default: break;
        }
        return false;
    }

    public LocalDate ingresarFecha(){
        LocalDate fecha;

        Scanner sc = new Scanner(System.in);

        System.out.print("\ningrese año (aaaa): ");     //toda esta parte es tentativa, podría hacerse
        int año = sc.nextInt();                         //con solo un input con el formato adecuado
        System.out.print("\ningrese mes (mm): ");
        int mes = sc.nextInt();
        System.out.print("\ningrese dia (dd) : ");
        int dia = sc.nextInt();

        //validar fecha

        fecha = LocalDate.of(año, mes, dia);      //habria que poner una excepción si el formato no es
                                                    //el adecuado
        return fecha;   //solo debe llegar aca cuando la fecha ingresada sea la correcta

    }

    public void mostrarVuelo(Vuelo vuelo){
        //TODO: mostrar toda la info del vuelo
    }

    public void mostrarCliente(Usuario cliente){
        System.out.print("Apellido y nombre: " + cliente.getApellido() + ", " + cliente.getNombre());
        System.out.print("DNI: " + cliente.getDNI());
        System.out.print("edad: " + cliente.getEdad());
    }
}
