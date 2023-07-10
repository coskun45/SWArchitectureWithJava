package org.example.mixin2.son;

import java.util.stream.Stream;

public interface Escalatable extends Stateful{
    String text();

    default String escalated() {
        // generics magic!
        int n = getState(Escalatable.class, 0);
        setState(Escalatable.class, n+1);

        // generate n bangs, or empty strings for n=0
        String bangs = Stream.generate(() -> "!")
                .limit(n)
                .reduce("", (a, b) -> a + b);

        return text().toUpperCase() + bangs;
    }
}
