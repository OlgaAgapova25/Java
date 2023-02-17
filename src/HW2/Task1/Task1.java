package HW2.Task1;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Sum = %d", calculation());
    }

    public static int calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of figures in the row: ");
        int n = scanner.nextInt();
        System.out.println("Enter your figures: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int numAbs = Math.abs(num);
            int count = 0;
            if (numAbs > 3) {
                for (int j = 2; j < numAbs; j++) {
                    if (numAbs % j == 0) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                sum += num;
            }
        }
        scanner.close();
        return sum;
    }
}