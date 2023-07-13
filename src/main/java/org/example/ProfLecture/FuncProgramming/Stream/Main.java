package org.example.ProfLecture.FuncProgramming.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        users.add(new User(1,"ali"));
        users.add(new User(2,"veli"));
        users.add(new User(3,"osman"));
        users.add(new User(4,"mehmet"));
        users.add(new User(5,"derya"));
        users.add(new User(6,"arzu"));
        int counter =0;
        users.stream()
                .forEach(s-> {
                    System.out.println(s);
                });
        users.stream().forEach(User::talk);
//count
        long count=users.stream().filter(user->user.id>5).count();
        System.out.println(count);
        // collect
        System.out.println("collect");
        List<User> collect = users.stream().filter(x -> x.id > 5).collect(Collectors.toList());

        collect.stream().forEach(System.out::println);

        System.out.println("map");

        users.stream().map(user->new User(user.id+100,user.name+"neu"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //map
        System.out.println("map");
        users.stream().collect(Collectors.toMap(user->user.id,user->user.name)).forEach((k,v)-> System.out.println(k+" "+v));


    }
}
