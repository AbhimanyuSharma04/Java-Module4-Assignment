import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Abhimanyu finish java assignment");
        tasks.add("buy notebook");
        tasks.add("revise collections");
        System.out.println("tasks: " + tasks);
        tasks.remove("buy notebook");
        System.out.println("after remove: " + tasks);
        System.out.println("all tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
