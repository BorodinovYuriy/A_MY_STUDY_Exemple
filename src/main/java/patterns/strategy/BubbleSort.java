package patterns.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("выполняется сортировка пузырьком");
    }
}
