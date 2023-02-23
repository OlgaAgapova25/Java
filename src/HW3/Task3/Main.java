package HW3.Task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("qwe", "dsf", 10.0, 2010, 7);
        Books book2 = new Books("fgs", "dasfa", 202.0, 2020, 7);
        Books book3 = new Books("hjk;l", "dasfa", 156.0, 1998, 9);
        Books book4 = new Books("fgs", "thger", 202.0, 2020, 15);

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        System.out.println(booksList);
        Integer targetYear = 2010;
        String targetChar = "a";
        List resultBooks = new ArrayList<>();
        for (Books item : booksList) {
            if (item.getAuthor().contains(targetChar) && item.getYear() >= targetYear && primes(item.getPages())) {
                resultBooks.add(item.getName());
            }
        }
        System.out.println("Hазвания книг, в которых простое количество страниц, " +
                "фамилия автора содержит «А» и год издания после 2010 г, включительно: " + resultBooks);
    }

    public static boolean primes(Integer n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (n > 3) {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
