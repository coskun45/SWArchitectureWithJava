package org.example.compositeProf;

public class Box extends Shipment{
    Shipment[] objects;

    int count() {
        int c = 0;
        for (Shipment o : objects) {
           c+= o.count();
        }
        return c;
    }
}
