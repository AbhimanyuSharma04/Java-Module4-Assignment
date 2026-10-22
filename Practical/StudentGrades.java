import java.util.TreeMap;

public class StudentGrades {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<String, Integer>();
        grades.put("Rohit", 78);
        grades.put("Abhimanyu", 92);
        grades.put("Kavya", 85);
        System.out.println(grades);
        System.out.println("Abhimanyu marks = " + grades.get("Abhimanyu"));
        grades.remove("Rohit");
        System.out.println("after remove: " + grades);
    }
}
