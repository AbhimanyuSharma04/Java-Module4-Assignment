import java.util.Stack;

public class StackOps {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Abhimanyu");
        st.push("Java");
        st.push("Stack");
        System.out.println("peek = " + st.peek());
        System.out.println("pop = " + st.pop());
        System.out.println("empty? " + st.empty());
        System.out.println(st);
    }
}
