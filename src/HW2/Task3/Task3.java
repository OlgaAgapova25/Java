package HW2.Task3;

import java.util.Arrays;

/**
 * Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, -1, -1, -50};
        System.out.println("Initial array: " + Arrays.toString(array));
        if (indexSum(array) == -1) {
            System.out.println("Error: there're no 2-digit figures in your array");
        } else {
            System.out.println("Modified array: " + Arrays.toString(newArr(array)));
        }
    }

    public static int indexSum(int[] arr) {
        int sum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) >= 10 && Math.abs(arr[i]) <= 99) {
                sum += i;
            } else {
                sum += 0;
            }
        }
        if (sum == -1 && (Math.abs(arr[0]) <= 10 || Math.abs(arr[0]) >= 99)) {
            return sum;
        } else {
            return sum + 1;
        }
    }

    public static int[] newArr(int[] arr) {
        int indexesSum = indexSum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = indexesSum;
            }
        }
        return arr;
    }
}
