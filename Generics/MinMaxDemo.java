import java.util.ArrayList;
import java.util.List;

class MinMaxFinder<T extends Comparable<T>> {
    List<T> list;

    MinMaxFinder(List<T> list) {
        this.list = list;
    }

    T findMin() {
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    T findMax() {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}

public class MinMaxDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(5);
        nums.add(30);
        nums.add(8);
        MinMaxFinder<Integer> m1 = new MinMaxFinder<Integer>(nums);
        System.out.println("min int = " + m1.findMin());
        System.out.println("max int = " + m1.findMax());

        ArrayList<String> names = new ArrayList<String>();
        names.add("Rohit");
        names.add("Abhimanyu");
        names.add("Kavya");
        MinMaxFinder<String> m2 = new MinMaxFinder<String>(names);
        System.out.println("min string = " + m2.findMin());
        System.out.println("max string = " + m2.findMax());
    }
}
