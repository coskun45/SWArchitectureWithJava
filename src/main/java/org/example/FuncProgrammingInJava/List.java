package org.example.FuncProgrammingInJava;

public class List<T>{
    final T head;
    final List<T> tail;

    private List(T el, List<T> tail) {
        this.head = el;
        this.tail = tail;
    }

    boolean isEmpty() {
        return head == null;
    }

    // factory methods for convenience...
    static <T> List<T> empty() {
        return new List<T>(null, null);
    }

    static <T> List<T> list(T elem, List<T> xs) {
        return new List<>(elem, xs);
    }

    static <T> List<T> list(T... elements) {
        if (elements.length == 0)
            return empty();
        int i = elements.length - 1;
        List<T> xs = list(elements[i], empty());// yeni bir liste olusturdu
        while (--i >= 0)
            xs = list(elements[i], xs);// elements[i] eklenecek eleman, xs eklenecek liste.
        // constructor xs ile elementi ayni listeye ekleyip geri döndürüyor.
        return xs;
    }





}
