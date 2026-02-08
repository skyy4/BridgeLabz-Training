package scenario-based.AuctionSystem;

public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.name);
    }
}
