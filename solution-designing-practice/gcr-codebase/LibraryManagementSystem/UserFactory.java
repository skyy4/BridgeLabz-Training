public class UserFactory {
    public static User createUser(String t, String n) {
        if (t.equalsIgnoreCase("student"))
            return new Student(n);
        if (t.equalsIgnoreCase("faculty"))
            return new Faculty(n);
        if (t.equalsIgnoreCase("librarian"))
            return new Librarian(n);
        throw new IllegalArgumentException("Unknown type");
    }
}
