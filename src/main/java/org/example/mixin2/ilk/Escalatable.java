package org.example.mixin2.ilk;

import java.util.stream.Stream;

public interface Escalatable {
    String text();   // to get the string
    int howOften();  // implementing class must handle counting!
    default String escalate() {
        int n = howOften();

        // n bangs in a row
        String bangs = Stream.generate(() -> "!")
                .limit(n)
                .reduce("", (a, b) -> a + b);

        return text().toUpperCase() + bangs;
    }
}
