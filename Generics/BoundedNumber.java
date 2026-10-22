class NumberBox<T extends Number> {
    T n;

    NumberBox(T n) {
        this.n = n;
    }

    double doubleValue() {
        return n.doubleValue();
    }
}

public class BoundedNumber {
    public static void main(String[] args) {
        NumberBox<Integer> a = new NumberBox<Integer>(10);
        NumberBox<Double> b = new NumberBox<Double>(4.5);
        System.out.println("Abhimanyu int box = " + a.doubleValue());
        System.out.println("double box = " + b.doubleValue());
    }
}
