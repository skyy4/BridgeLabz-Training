public class MissingPositive {

    static int missing(int[] a) {
        int n = a.length;
        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < n; i++)
            if (a[i] > 0 && a[i] <= n)
                seen[a[i]] = true;

        for (int i = 1; i <= n; i++)
            if (!seen[i])
                return i;
        return n + 1;
    }

    static int binary(int[] a, int t) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t)
                return m;
            if (a[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, -1, 1 };
        System.out.println(missing(a));
    }
}
