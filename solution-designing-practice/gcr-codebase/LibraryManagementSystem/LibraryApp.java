public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog c = LibraryCatalog.getInstance();

        User u1 = UserFactory.createUser("student", "Alice");
        User u2 = UserFactory.createUser("faculty", "Dr. Bob");

        u1.showRole();
        u2.showRole();

        c.addObserver(u1);
        c.addObserver(u2);

        Book bk = new Book.B("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        c.addBook(bk);
    }
}
