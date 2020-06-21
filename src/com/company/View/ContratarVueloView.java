package com.company.View;

import com.company.App.Admin;
import com.company.App.ContratarVuelo;
import com.company.Controller.AdminController;
import com.company.Controller.ContratarVueloController;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.util.Scanner;

public class ContratarVueloView implements View {
    private ContratarVuelo contratarVuelo;
    private ContratarVueloController contratarVueloController;
    private static String titulo= "CONTRATAR VUELO";
    private static String op1= "Elegir fecha(ingresando dd/mm/aaaa) : ";
    private static String op2= "Elegir Ciudad Origen: 1.BS_As 2.Cordoba 3.Montevideo 4.Santiago ";
    private static String op3= "Elegir Ciudad Destino: 1.BS_As 2.Cordoba 3.Montevideo 4.Santiago ";
    private static String op4= "Cuantos acompañantes píensa llevar: ";
    public ContratarVueloView(ContratarVuelo contratarVuelo, ContratarVueloController contratarVueloController) {
        this.contratarVuelo = contratarVuelo;
        this.contratarVueloController = contratarVueloController;
        contratarVuelo.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print(titulo + "\n\n" + op1);
        String fecha = sc.next();
        ingresarFecha(fecha);

        System.out.println("\n\n" + op2);
        String origen = sc.next();
        try{
            contratarVueloController.execute(origen);
            System.out.println("Se ha ingresado la ciudad de origen.");
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        System.out.println("\n\n" + op3);
        String destino = sc.next();
        try{
            contratarVueloController.execute(destino);
            System.out.println("Se ha ingresado la ciudad de destino.");
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        System.out.println("\n\n" + op4);
        String acompañante = sc.nextLine();

        try{
            contratarVueloController.execute(origen);
            System.out.println("Se han ingresado la cantidad de acompañantes.");
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        //en este punto debe seguirse una serie de pasos:
        //1 - elegir fecha
        //2 - se debe elegir origen
        //3 - elegir destino
        //4 - elegir si se viaja con acompañantes o no
        //5 - elegir aviones disponibles
        //6 - finalmente, mostrar y confirmar vuelo

    }

    public void ingresarFecha(String fecha){
        try{
            contratarVueloController.execute(fecha);
            System.out.println("Se ha ingresado la fecha.");
        }catch (Exception e){
            System.out.println("Has ingresado mal la fecha vuelve a intentarlo");
            ingresarFecha(fecha);
        }
    }

  /*  public void show(arreglo de ciudades){

    }
*/
    private void askForCommand() {
        try (Scanner scanner = new Scanner(System.in)) {
            String command;
            do {
                command = scanner.nextLine();
            } while (!contratarVueloController.execute(command));
        }
    }

    public void mostrarCosto(){
        //System.out.println("El costo total de su vuelo es de $" + contratarVueloController.calcularCosto(vuelo));
    }

}
