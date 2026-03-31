public class Faculty implements User {
    private String n;

    public Faculty(String n) {
        this.n = n;
    }

    public void showRole() {
        System.out.println(n + " is a Faculty.");
    }

    public void update(String m) {
        System.out.println(n + " notified: " + m);
    }
}
