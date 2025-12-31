public class Book {

    private String ttl;
    private String aut;
    private double pr;

    // Default constructor
    public Book() {
        this.ttl = "NA";
        this.aut = "NA";
        this.pr = 0;
    }

    // Parameterized constructor
    public Book(String ttl, String aut, double pr) {
        this.ttl = ttl;
        this.aut = aut;
        this.pr = pr;
    }
}

