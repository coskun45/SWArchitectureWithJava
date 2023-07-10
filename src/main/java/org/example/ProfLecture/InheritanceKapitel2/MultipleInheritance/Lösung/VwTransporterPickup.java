package org.example.ProfLecture.InheritanceKapitel2.MultipleInheritance.Lösung;

import java.util.List;

public class VwTransporterPickup implements Van,Pickup {

    private List persons;
    private List cargos;
    @Override
    public List getCargos() {
        return persons;
    }

    @Override
    public List getPersons() {
        return cargos;
    }
}
