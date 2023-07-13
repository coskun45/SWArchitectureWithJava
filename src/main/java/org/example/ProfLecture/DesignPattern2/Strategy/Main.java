package org.example.ProfLecture.DesignPattern2.Strategy;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        Sorter sorter=new Sorter();

        sorter.setStrategy(new BubbleSort());
        sorter.sortArray(arr);
    }
}
