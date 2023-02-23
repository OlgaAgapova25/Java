package HW4.Task2;


import java.util.ArrayDeque;
import java.util.Deque;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
 */
public class Task2 {
    public static void main(String[] args) {
        String s = "[()]{[()]}()[]{}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if ((s.length() & 1) == 1) return false;
        else {
            Deque<Character> paranthesis = new ArrayDeque<>(s.length());
            for (int i = 0; i < s.length(); i++)
                switch (s.charAt(i)) {
                    case '(':
                        paranthesis.push(')');
                        break;
                    case '{':
                        paranthesis.push('}');
                        break;
                    case '[':
                        paranthesis.push(']');
                        break;
                    case ')':
                    case '}':
                    case ']':
                        if (paranthesis.isEmpty() || paranthesis.pop() != s.charAt(i)) {
                            return false;
                        }
                }
            return paranthesis.isEmpty();
        }
    }
}