/*
Дана последовательность целых чисел, оканчивающаяся нулем.
Найти сумму положительных чисел, после которых следует отрицательное число.
 */
package HW1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num1>0 && num2 <0){
                sum += num1;
            }
            num1 = num2;
        }
        System.out.println(sum);
    }
}

