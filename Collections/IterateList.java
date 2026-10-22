import java.util.ArrayList;
import java.util.Iterator;

public class IterateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("enhanced for");
        for (Integer n : list) {
            System.out.println(n);
        }

        System.out.println("iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("done by Abhimanyu");
    }
}
