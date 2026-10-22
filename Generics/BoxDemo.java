class Box<T> {
    T item;

    void addItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> b1 = new Box<String>();
        b1.addItem("Abhimanyu");
        System.out.println("string box = " + b1.getItem());

        Box<Integer> b2 = new Box<Integer>();
        b2.addItem(25);
        System.out.println("integer box = " + b2.getItem());
    }
}
