public class Book {
    private String t;
    private String a;
    private String e;
    private String g;

    private Book(B b) {
        t = b.t;
        a = b.a;
        e = b.e;
        g = b.g;
    }

    public String getTitle() {
        return t;
    }

    public static class B {
        private String t;
        private String a;
        private String e;
        private String g;

        public B(String t) {
            this.t = t;
        }

        public B author(String a) {
            this.a = a;
            return this;
        }

        public B edition(String e) {
            this.e = e;
            return this;
        }

        public B genre(String g) {
            this.g = g;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
