package org.example.ProfLecture.DPKapitel6.Composite.OhneArch;

public class Box {
    Object[] objects;

    int count() {
        int c = 0;
        for (Object o : objects) {
            if (o instanceof Box)
                c += ((Box) o).count();
            else if (o instanceof Shoes)
                c += 2;
            else
                c += 1;
        }
        return c;
    }
}
