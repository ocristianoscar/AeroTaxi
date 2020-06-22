package com.company.Domain;

import com.company.Model.Avion;
import com.company.Model.Usuario;
import com.company.Model.Vuelo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class CapaDatos {

    static public List<Usuario> usersList;
    static public List<Vuelo> vuelosList;
    static public List<Avion> avionList;

    public static void uploadUsers(ArrayList<Usuario> users) {
        try {
            File file = new File("Usuarios.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> downloadUsers(File file)
    {
        try
        {
            file = new File("Usuarios.json");
            ObjectMapper mapper = new ObjectMapper();
            Usuario[] users = mapper.readValue(file, Usuario[].class);
            List<Usuario> listUsuario = new ArrayList();
            for(Usuario user:users) {
                listUsuario.add(user);
            }
            CapaDatos.setUsersList(listUsuario);
            return listUsuario;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void uploadVuelos(ArrayList<Vuelo> vuelos) {
        try {
            File file = new File("Vuelos.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, vuelos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Vuelo> downloadVuelos(File file)
    {
        try
        {
            file = new File("Vuelos.json");
            ObjectMapper mapper = new ObjectMapper();
            Vuelo[] vuelos = mapper.readValue(file, Vuelo[].class);
            List<Vuelo> listVuelos = new ArrayList();
            for(Vuelo vuelo:vuelos) {
                listVuelos.add(vuelo);
            }
            CapaDatos.setVuelosList(listVuelos);
            return listVuelos;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void uploadAviones(ArrayList<Avion> aviones) {
        try {
            File file = new File("Aviones.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, aviones);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Avion> downloadAviones(File file)
    {
        try
        {
            file = new File("Aviones.json");
            ObjectMapper mapper = new ObjectMapper();
            Avion[] aviones = mapper.readValue(file, Avion[].class);
            List<Avion> listVuelos = new ArrayList();
            for(Avion avion:aviones) {
                listVuelos.add(avion);
            }
            CapaDatos.setAvionList(listVuelos);
            return listVuelos;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void  setUsersList(List<Usuario> usersList) { CapaDatos.usersList = usersList; }

    public static void setVuelosList(List<Vuelo> vuelosList) { CapaDatos.vuelosList = vuelosList; }

    public static void setAvionList(List<Avion> avionList) { CapaDatos.avionList = avionList; }

    public static List<Usuario> getUsersList() {
        return usersList;
    }

    public static List<Vuelo> getVuelosList() {
        return vuelosList;
    }

    public static List<Avion> getAvionList() {
        return avionList;
    }
}
