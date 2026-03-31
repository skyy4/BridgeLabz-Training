public class Student implements User {
    private String n;

    public Student(String n) {
        this.n = n;
    }

    public void showRole() {
        System.out.println(n + " is a Student.");
    }

    public void update(String m) {
        System.out.println(n + " notified: " + m);
    }
}
