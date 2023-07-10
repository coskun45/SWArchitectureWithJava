package org.example.ProfLecture.ReflectionKapital5.JavaBean;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class TextGameLoader {
    public static void main(String... args) throws
            IOException, ClassNotFoundException, IllegalAccessException,
            InstantiationException {

        // load classes from jar file
        URL url = new URL("jar:file:/Users/riko493/git/hsro-inf-prg3/example/games.jar!/");

        URLClassLoader cl = URLClassLoader.newInstance(new URL[] {url});

        // you can play "Addition" or "Parrot"
        final String choice = "Parrot";

        TextBasedGame g = (TextBasedGame) cl.loadClass("reflection.games." + choice)
                .newInstance();
        g.run(System.in, System.out);
    }
}
