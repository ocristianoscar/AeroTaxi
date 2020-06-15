package com.company.Model;

public class Silver extends Avion{


    public Silver(int capacidadCombustible, int costoKM, int capacidadPasajeros, int velMax, Propulsion propulsion, boolean vueloProgramado) {
        this.setCapacidadCombustible(capacidadCombustible);
        this.setCostoKM(costoKM);
        this.setCapacidadPasajeros(capacidadPasajeros);
        this.setVelMax(velMax);
        this.setPropulsion(propulsion);
        this.setVueloProgramado(vueloProgramado);
    }

}
