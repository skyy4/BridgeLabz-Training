package scenario_based;

public class TicketSorter {

    static int part(int[] a, int l, int h) {
        int p = a[h], i = l - 1;
        for (int j = l; j < h; j++) {
            if (a[j] < p) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[h];
        a[h] = t;
        return i + 1;
    }

    static void quick(int[] a, int l, int h) {
        if (l < h) {
            int p = part(a, l, h);
            quick(a, l, p - 1);
            quick(a, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] price = { 500, 200, 800, 100, 300 };
        quick(price, 0, price.length - 1);
        for (int p : price)
            System.out.println(p);
    }
}
