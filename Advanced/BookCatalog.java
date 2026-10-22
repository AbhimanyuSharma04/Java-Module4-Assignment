import java.util.HashMap;

public class BookCatalog {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String, String>();
        books.put("Java Basics", "Abhimanyu Sharma");
        books.put("OOP Guide", "Herbert");
        books.put("Collections", "Kathy");
        String title = "Java Basics";
        if (books.containsKey(title)) {
            System.out.println(title + " author = " + books.get(title));
        } else {
            System.out.println("not found");
        }
        System.out.println(books);
    }
}
