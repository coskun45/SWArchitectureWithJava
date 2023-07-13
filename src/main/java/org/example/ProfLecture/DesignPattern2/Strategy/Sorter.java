package org.example.ProfLecture.DesignPattern2.Strategy;

public class Sorter {
    SortStrategy strategy;
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sortAlgorithm(array);
    }
}
