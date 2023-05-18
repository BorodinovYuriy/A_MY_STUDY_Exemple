package patterns.strategy;

public class MargeSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("выполняется сортировка слиянием");
    }
}
