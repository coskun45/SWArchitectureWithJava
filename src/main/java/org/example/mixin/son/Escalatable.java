package org.example.mixin.son;

public interface Escalatable {
    // this is where we will get the data needed for our functionality
    String text();

    // this is the actual code, implemented only once!
    default String escalate() {
        // yes, we can refer to non-default methods here
        return text().toUpperCase();
    }
}
