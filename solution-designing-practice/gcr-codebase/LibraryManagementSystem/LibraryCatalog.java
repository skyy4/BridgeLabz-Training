import java.util.*;

public class LibraryCatalog {
    private static LibraryCatalog i;
    private List<Book> b = new ArrayList<>();
    private List<Observer> o = new ArrayList<>();

    private LibraryCatalog() {
    }

    public static synchronized LibraryCatalog getInstance() {
        if (i == null)
            i = new LibraryCatalog();
        return i;
    }

    public void addObserver(Observer ob) {
        o.add(ob);
    }

    public void removeObserver(Observer ob) {
        o.remove(ob);
    }

    public void addBook(Book bk) {
        b.add(bk);
        notifyAll(bk.getTitle());
    }

    private void notifyAll(String t) {
        for (Observer x : o) {
            x.update("New book available: " + t);
        }
    }
}
