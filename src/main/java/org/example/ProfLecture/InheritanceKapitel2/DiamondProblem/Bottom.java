package org.example.ProfLecture.InheritanceKapitel2.DiamondProblem;

public class Bottom implements Left, Right{
    public void method() {
        System.out.println("Bottom.method()");

        // use <Interface>.super.<methodname> to access default methods
        Left.super.method();
        Right.super.method();
    }

    public static void main(String... args) {
        Bottom b = new Bottom();
        b.method();
    }
}
