import java.util.ArrayList;

public class Library {

    static class Book {
        String ttl;
        String aut;
        boolean avl;

        Book(String ttl, String aut) {
            this.ttl = ttl;
            this.aut = aut;
            this.avl = true;
        }
    }

    static ArrayList<Book> list = new ArrayList<>();

    // Search by partial title
    public static void find(String key) {
        for (Book b : list) {
            if (b.ttl.contains(key)) {
                System.out.println(b.ttl + " - " + (b.avl ? "Available" : "Out"));
            }
        }
    }

    // Checkout book
    public static void chk(String ttl) {
        for (Book b : list) {
            if (b.ttl.equals(ttl)) {
                if (!b.avl) {
                    throw new IllegalStateException("Book not available");
                }
                b.avl = false;
                return;
            }
        }
    }

    public static void main(String[] args) {

        list.add(new Book("Java Basics", "James"));
        list.add(new Book("DSA", "Mark"));

        find("Java");
        chk("Java Basics");
        find("Java");
    }
}

