
import java.util.*;

class Book {
    String title, author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class BookShelf {

    HashMap<String, LinkedList<Book>> map = new HashMap<>();
    HashSet<String> unique = new HashSet<>();

    void addBook(String genre, String title, String author) {
        String key = genre + title;
        if (unique.contains(key))
            return;

        unique.add(key);
        map.putIfAbsent(genre, new LinkedList<>());
        map.get(genre).add(new Book(title, author));
    }

    void removeBook(String genre, String title) {
        if (!map.containsKey(genre))
            return;

        Iterator<Book> it = map.get(genre).iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                unique.remove(genre + title);
                return;
            }
        }
    }

    void display() {
        for (String g : map.keySet()) {
            System.out.println(g + ":");
            for (Book b : map.get(g))
                System.out.println("  " + b);
        }
    }

    public static void main(String[] args) {
        BookShelf b = new BookShelf();
        b.addBook("Fiction", "1984", "Orwell");
        b.addBook("Fiction", "Animal Farm", "Orwell");
        b.addBook("Tech", "Java", "Gosling");
        b.display();
        b.removeBook("Fiction", "1984");
        b.display();
    }
}
