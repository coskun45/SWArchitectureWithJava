package org.example.ProfLecture.InheritanceKapitel2.LiskovPrinsip;

public class Main {
    static void work(Shape s) { /* ... */ }
    static void ensureLiskov(Rectangle r) {
        r.setWidth(10);
        r.setHeight(15);

        assert r.getWidth() == 10;
    }
    public static void main(String[] args) {
        Shape s = new Shape(0, 0);
        Rectangle r = new Rectangle(0, 0, 10, 15);

        work(s);
        work(r);  // Rectangle is subtype of Shape
        Rectangle r2 = new Rectangle(0, 0, 5, 5);
        ensureLiskov(r2);

        Square s2 = new Square(0, 0, 5);
        ensureLiskov(s2);  // assertion failed!
    }
}
