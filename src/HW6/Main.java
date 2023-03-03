package HW6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Double> noteMemory = new HashMap<>();
        {
            noteMemory.put(1, 3.1);
            noteMemory.put(2, 2.5);
            noteMemory.put(3, 3.5);
            noteMemory.put(4, 3.5);
            noteMemory.put(5, 4.6);
        }
        Map<Integer, Double> noteHD = new HashMap<>();
        {
            noteHD.put(1, 1.5);
            noteHD.put(2, 2.5);
            noteHD.put(3, 2.2);
            noteHD.put(4, 3.5);
            noteHD.put(5, 2.8);
        }
        Map<Integer, String> noteOS = new HashMap<>();
        {
            noteOS.put(1, "Windows");
            noteOS.put(2, "Windows");
            noteOS.put(3, "MacOS");
            noteOS.put(4, "MacOS");
            noteOS.put(5, "Linux");
        }
        Map<Integer, String> noteBrand = new HashMap<>();
        {
            noteBrand.put(1, "HP");
            noteBrand.put(2, "Dell");
            noteBrand.put(3, "Mac");
            noteBrand.put(4, "Mac");
            noteBrand.put(5, "Toshiba");
        }

        filter(noteBrand, noteOS, noteHD, noteMemory);
    }


    public static int choice() {
        System.out.println("Enter a parameter for filter (\n" +
                "1 - Brand\n" +
                "2 - OS\n" +
                "3 - HD\n" +
                "4 - Memory)\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static String valueBrand() {
        System.out.println("Enter the brand name you're searching: ");
        Scanner sc1 = new Scanner(System.in);
        String value = sc1.nextLine();
        return value;
    }

    public static String valueOS() {
        System.out.println("Enter the OS name you're searching: ");
        Scanner sc2 = new Scanner(System.in);
        String value = sc2.nextLine();
        return value;
    }

    public static double valueHD() {
        System.out.println("Enter minimal value of HD: ");
        Scanner sc3 = new Scanner(System.in);
        double value = sc3.nextDouble();
        return value;
    }

    public static double valueMemory() {
        System.out.println("Enter minimal value of memory: ");
        Scanner sc4 = new Scanner(System.in);
        double value = sc4.nextDouble();
        return value;
    }

    public static void filter(Map<Integer, String> noteBrand, Map<Integer, String> noteOS, Map<Integer, Double> noteHD, Map<Integer, Double> noteMemory) {
        int option = choice();
        switch (option) {
            case 1:
                String value1 = valueBrand();
                System.out.println("IDs of notebooks satisfying the requirements are: ");
                for (var entry : noteBrand.entrySet()) {
                    if (entry.getValue().equals(value1)) {
                        System.out.println(entry.getKey());
                    }
                }
                break;
            case 2:
                String value2 = valueOS();
                System.out.println("IDs of notebooks satisfying the requirements are: ");
                for (var entry : noteOS.entrySet()) {
                    if (entry.getValue().equals(value2)) {
                        System.out.println(entry.getKey());
                    }
                }
                break;
            case 3:
                double value3 = valueHD();
                System.out.println("IDs of notebooks satisfying the requirements are: ");
                for (var entry : noteHD.entrySet()) {
                    if (entry.getValue() >= value3) {
                        System.out.println(entry.getKey());
                    }
                }
                break;
            case 4:
                double value4 = valueMemory();
                System.out.println("IDs of notebooks satisfying the requirements are: ");
                for (var entry : noteMemory.entrySet()) {
                    if (entry.getValue() >= value4) {
                        System.out.println(entry.getKey());
                    }
                }
                break;
        }
    }
}