package org.example.ProfLecture.Thread.ConsumerProdecur;

import java.util.LinkedList;
import java.util.List;

public class Buffer<T> {
    List<T> buffer = new LinkedList<>();
    final int max = 10;

    synchronized void put(T obj) throws InterruptedException {
        // wait until buffer not full
        while (buffer.size() == 10) {
            System.out.println("wait in put...");

            wait();
        }

        buffer.add(obj);
        System.out.println("in put "+buffer.size());


        // wake up other threads waiting for buffer to change
        notifyAll();
        System.out.println("notify in put...");

    }

    synchronized T get() throws InterruptedException {
        // wait until there's something in the buffer
        while (buffer.size() == 0){
            System.out.println("wait in get...");
            wait();

        }

        T obj = buffer.remove(0);
        System.out.println("in get "+buffer.size());

        // wake up other threads waiting for buffer to change
        notifyAll();
        System.out.println("notify in get...");
        return obj;
    }
}
