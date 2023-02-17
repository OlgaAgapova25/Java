package HW2.Task2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.printf("The sequence " + calculation() + " ascending");
    }
    public static String calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of figures in the row: ");
        int n = scanner.nextInt();
        System.out.println("Enter your figures: ");
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 <= num1) {
                count++;
            }
            num1 = num2;
        }
        if (count == 0) {
            return "is";
        }
        else{
            return "is not";
        }
    }
}
