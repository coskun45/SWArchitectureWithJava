package org.example.ProfLecture.Thread.Prüfung;

public class Container{

    public Container() {
    }

    class  Inner{
        void method(){
            HelloWorld frenchGreeting = new HelloWorld() {
                String name = "tout le monde";
                public void greet() {
                    greetSomeone("tout le monde");
                }
                public void greetSomeone(String someone) {
                    name = someone;
                    System.out.println("Salut " + name);
                }
            };

        }
    }

}
