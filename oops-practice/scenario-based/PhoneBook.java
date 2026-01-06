import java.util.ArrayList;

public class PhoneBook {

    static class Con {
        String nm;
        String ph;

        Con(String nm, String ph) {
            if (ph.length() != 10) {
                throw new IllegalArgumentException("Invalid phone number");
            }
            this.nm = nm;
            this.ph = ph;
        }
    }

    static ArrayList<Con> list = new ArrayList<>();

    // Add contact
    public static void add(String nm, String ph) {
        for (Con c : list) {
            if (c.ph.equals(ph)) {
                throw new IllegalArgumentException("Duplicate contact");
            }
        }
        list.add(new Con(nm, ph));
    }

    // Search contact
    public static void find(String ph) {
        for (Con c : list) {
            if (c.ph.equals(ph)) {
                System.out.println(c.nm + " " + c.ph);
                return;
            }
        }
        System.out.println("Not found");
    }

    // Delete contact
    public static void del(String ph) {
        list.removeIf(c -> c.ph.equals(ph));
    }

    public static void main(String[] args) {
        add("Amit", "9876543210");
        add("Ravi", "9123456789");
        find("9876543210");
        del("9123456789");
    }
}

