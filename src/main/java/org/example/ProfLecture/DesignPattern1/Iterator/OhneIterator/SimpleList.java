package org.example.ProfLecture.DesignPattern1.Iterator.OhneIterator;

import java.util.NoSuchElementException;

public class SimpleList<T> implements BasicList<T> {
    private class Element {
        Element(T value) { this.value = value; }
        Element next;
        T value;
    }

    private Element root;
    private int size;

    public void add(T value) {
        if (root == null) {
            root = new Element(value);
            size = 1;
            return;
        }

        Element it = root;
        while (it.next != null)
            it = it.next;

        it.next = new Element(value);
        size++;
    }

    public T get(int i) {
        if (root == null)
            throw new NoSuchElementException();

        Element it = root;
        while (i-- > 0) {
            it = it.next;

            if (it == null)
                throw new NoSuchElementException();
        }

        return it.value;
    }

    public int size() {
        return size;
    }

    // koleksiyon a birden fazla eleman eklemek icin
    public void addAll(T[] values) {
        // start at the beginning, find the end
        Element it = root;
        while (it != null && it.next == null)
            it = it.next;

        // for each new value, remember where we added it
        for (T v : values) {
            if (it == null) {
                root = it = new Element(v);
            } else {
                it.next = new Element(v);
                it = it.next;
            }
        }
        size = size + values.length;
    }
}
