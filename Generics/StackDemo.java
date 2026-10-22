class MyStack<T> {
    T[] arr;
    int top;

    @SuppressWarnings("unchecked")
    MyStack(int size) {
        arr = (T[]) new Object[size];
        top = -1;
    }

    void push(T item) {
        top++;
        arr[top] = item;
    }

    T pop() {
        T v = arr[top];
        top--;
        return v;
    }

    T peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack<Integer> s1 = new MyStack<Integer>(5);
        s1.push(10);
        s1.push(20);
        System.out.println("int peek = " + s1.peek());
        System.out.println("int pop = " + s1.pop());

        MyStack<String> s2 = new MyStack<String>(5);
        s2.push("Abhimanyu");
        s2.push("Java");
        System.out.println("string peek = " + s2.peek());
        System.out.println("string pop = " + s2.pop());
    }
}
