package org.example.ProfLecture.InheritanceKapitel2.DiamondProblem;

interface Left extends Top {
    default void method() {
        System.out.println("Left.method()");
    }
}
interface Right extends Top {
    default void method() {
        System.out.println("Right.method()");
    }
}
 interface Top {
    void method();
}
