package org.example.ProfLecture.FuncProgramming.Stream;
public class User {
    int id;
    String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void talk(){
        System.out.println("Hi, I am "+ this.name);
    }
}
