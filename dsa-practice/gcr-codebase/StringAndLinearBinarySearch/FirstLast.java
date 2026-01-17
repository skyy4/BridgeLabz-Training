public class FirstLast {
    static int find(int[] a, int t, boolean first) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t) {
                res = m;
                if (first)
                    r = m - 1;
                else
                    l = m + 1;
            } else if (a[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 2, 3 };
        System.out.println(find(a, 2, true));
        System.out.println(find(a, 2, false));
    }
}
