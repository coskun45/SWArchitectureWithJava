package org.example.ProfLecture.DesignPattern1.Composite.MitArch;

public class Box extends Shipment{

    private Shipment[] contents;
    int count() {
        int c = 0;
        for (Shipment s : contents)
            c += s.count();
        return c;
    }

}
