public class LibBook {

    private String ttl;
    private String aut;
    private double pr;
    private boolean avl;

    public LibBook(String ttl, String aut, double pr) {
        this.ttl = ttl;
        this.aut = aut;
        this.pr = pr;
        this.avl = true;
    }

    // Borrow book if available
    public void borrow() {
        if (avl) {
            avl = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }
}

