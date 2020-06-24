package com.company.Domain;

import java.time.LocalDate;

public class Fecha {

    private final LocalDate fecha;

    public Fecha(){
        fecha = null;
    }

    private Fecha(LocalDate inicio) {
        this.fecha = inicio;
    }

    public static Fecha desde(LocalDate start) {
        return new Fecha(start);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getEnd() {
        return fecha.plusDays(6);
    }

    public Fecha siguenteDia() { return new Fecha(fecha.plusDays(1)); }

    public Fecha anteriorDia() { return new Fecha(fecha.minusDays(1)); }

    public boolean validarFecha(String año, String mes, String dia){
        //TODO validar la fecha
        return true;
    }


}
