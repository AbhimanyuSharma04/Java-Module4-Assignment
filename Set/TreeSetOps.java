import java.util.TreeSet;

public class TreeSetOps {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(40);
        set.add(10);
        set.add(25);
        set.add(7);
        System.out.println("set = " + set);
        System.out.println("smallest = " + set.first());
        System.out.println("largest = " + set.last());
        set.remove(25);
        System.out.println("after remove 25 = " + set);
    }
}
