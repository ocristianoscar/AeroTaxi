package com.company.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class Vuelo {
    private LocalDateTime dateTime;
    private Usuario usuario;
    private List<Acompañante> acompañantes;
    private Avion avion;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;

    public Vuelo(LocalDateTime dateTime, Usuario usuario, List<Acompañante> acompañantes, Avion avion, Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        this.usuario = usuario;
        this.dateTime = dateTime;
        this.acompañantes = acompañantes;
        this.avion = avion;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }

    public LocalTime getHora() {
        return dateTime.toLocalTime();
    }

    public String getUsuarioNombre() { return usuario.getNombre(); }

    public List<String> getAcompañantesNombres() {
        return acompañantes.stream()
                .map(Acompañante::getNombre)
                .collect(Collectors.toList());

    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public Avion getAvion() {
        return avion;
    }

    public boolean isOn(LocalDate date) {
        return dateTime.toLocalDate().equals(date);
    }
}
