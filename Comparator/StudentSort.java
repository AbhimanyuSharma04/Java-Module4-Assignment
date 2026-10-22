import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Rohit", 76));
        list.add(new Student("Abhimanyu", 91));
        list.add(new Student("Kavya", 85));
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return b.marks - a.marks;
            }
        });
        System.out.println("by marks");
        for (Student s : list) {
            System.out.println(s);
        }
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("by name");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
