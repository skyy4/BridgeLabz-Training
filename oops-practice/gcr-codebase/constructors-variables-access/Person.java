public class Person {

    private String nm;
    private int ag;

    public Person(String nm, int ag) {
        this.nm = nm;
        this.ag = ag;
    }

    // Copy constructor
    public Person(Person p) {
        this.nm = p.nm;
        this.ag = p.ag;
    }
}

