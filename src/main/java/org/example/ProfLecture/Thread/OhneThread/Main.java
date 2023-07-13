package org.example.ProfLecture.Thread.OhneThread;

public class Main {
    public static void main(String[] args) {

        BeanCounter b1 = new BeanCounter("Bureaucrat(Bürokrat) 1", 10000);
        BeanCounter b2 = new BeanCounter("Bureaucrat 2", 1000);

        b1.run();
        b2.run();

        System.out.println("main() done!");
    }
}
