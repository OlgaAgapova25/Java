/*
Given an input string s, reverse the order of the words.
 */
package HW1.Task1;
public class Task1 {
    public static void main(String[] args) {
        String s = "asd fre      h";
        String[] s_split = s.split("\\s+");
        String new_string = "";
        for (int i = s_split.length-1; i >= 0; i--) {
            new_string += (s_split[i] + " ");
        }
        System.out.println(new_string);
    }
}
