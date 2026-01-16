public class QuickSortPrices {

    static int part(int[] a, int l, int h) {
        int p = a[h];
        int i = l - 1;

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

    static void sort(int[] a, int l, int h) {
        if (l < h) {
            int p = part(a, l, h);
            sort(a, l, p - 1);
            sort(a, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] price = { 999, 199, 499, 299 };
        sort(price, 0, price.length - 1);
        for (int x : price)
            System.out.print(x + " ");
    }
}
