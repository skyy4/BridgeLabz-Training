public class Librarian implements User {
    private String n;

    public Librarian(String n) {
        this.n = n;
    }

    public void showRole() {
        System.out.println(n + " is a Librarian.");
    }

    public void update(String m) {
        System.out.println(n + " notified: " + m);
    }
}
