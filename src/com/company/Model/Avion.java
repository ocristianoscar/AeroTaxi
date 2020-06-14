package com.company.Model;

public abstract class Avion {

    private int capacidadCombustible;
    private int costoKM;
    private int capacidadPasajeros;
    private int velMax;
    private int tarifa;
    Propulsion propulsion;
    private boolean vueloProgramado;

    public int getCapacidadCombustible() { return capacidadCombustible; }

    public void setCapacidadCombustible(int capacidadCombustible) { this.capacidadCombustible = capacidadCombustible; }

    public int getCostoKM() { return costoKM; }

    public void setCostoKM(int costoKM) { this.costoKM = costoKM; }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }

    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

    public int getVelMax() { return velMax; }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public void setVelMax(int velMax) { this.velMax = velMax; }

    public Propulsion getPropulsion() { return propulsion; }

    public void setPropulsion(Propulsion propulsion) { this.propulsion = propulsion; }

    public boolean isVueloProgramado() { return vueloProgramado; }

    public void setVueloProgramado(boolean vueloProgramado) { this.vueloProgramado = vueloProgramado; }
}
