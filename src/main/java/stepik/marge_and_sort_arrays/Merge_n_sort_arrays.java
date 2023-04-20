package stepik.marge_and_sort_arrays;

import java.util.Arrays;

/**Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
        Массивы могут быть любой длины, в том числе нулевой.
        Предполагается, что вы реализуете алгоритм слияния,
        имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
        Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
        Пример
        Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}*/

public class Merge_n_sort_arrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {2,5,7,3,1,2,2,0};
        int[] a2 = {2,5,7,3,1,2,2,0};
        int[] a3 = {};
        System.out.println(Arrays.toString((mergeArrays(a1, a2))));

    }













}
