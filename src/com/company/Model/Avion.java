package com.company.Model;

public abstract class Avion {
    private int capacidadCombustible;
    private int costoKM;
    private int capacidadPasajeros;
    private int velMax;
    private enum Propulsion{
        Reaccion,
        Helice,
        Pistones
    }

}
