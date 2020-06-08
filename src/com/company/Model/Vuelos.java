package com.company.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vuelo {
    private List<Vuelo> visits = new ArrayList<>();

    public void add(Vuelo vuelo) {
        this.visits.add(vuelo);
    }

    public List<Vuelo> on(LocalDate date) {
        return visits.stream()
                .filter(visit -> visit.isOn(date))
                .collect(Collectors.toList());
    }
}
