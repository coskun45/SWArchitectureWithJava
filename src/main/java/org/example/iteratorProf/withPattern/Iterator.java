package org.example.iteratorProf.withPattern;

public interface Iterator<T> {
    boolean hasNext();  // is there one more element?
    T next();           // give me that, and advance!
}
