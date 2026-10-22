import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeDeque {
    static boolean check(String s) {
        Deque<Character> dq = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            dq.addLast(s.charAt(i));
        }
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "madam";
        String b = "abhimanyu";
        System.out.println(a + " palindrome? " + check(a));
        System.out.println(b + " palindrome? " + check(b));
    }
}
