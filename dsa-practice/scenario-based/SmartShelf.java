// package scenario_based;

public class SmartShelf {

    static void sort(String[] a) {
        for (int i = 1; i < a.length; i++) {
            String key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j].compareToIgnoreCase(key) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] books = { "Java", "Algorithms", "Clean Code", "Data" };
        sort(books);
        for (String b : books)
            System.out.println(b);
    }
}
