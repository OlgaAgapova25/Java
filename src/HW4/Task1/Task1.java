package HW4.Task1;

import java.util.Arrays;
import java.util.LinkedList;

/*Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> initialList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = initialList.size()-1; i >= 0;i--){
            reverseList.add(initialList.getLast());
            initialList.removeLast();
        }
        System.out.println(reverseList);
    }
}
