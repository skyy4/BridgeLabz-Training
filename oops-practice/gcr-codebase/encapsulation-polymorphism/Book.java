interface Res {
    boolean chk();
}

abstract class LibItem {

    private String ttl;

    public LibItem(String ttl) {
        this.ttl = ttl;
    }

    public abstract int days();
}

public class Book extends LibItem implements Res {

    public Book(String ttl) {
        super(ttl);
    }

    public int days() {
        return 14;
    }

    public boolean chk() {
        return true;
    }
}

