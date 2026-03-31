public class Search2D {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 3, 5 },
                { 7, 9, 11 }
        };
        int t = 9;
        int r = a.length, c = a[0].length;
        int l = 0, h = r * c - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            int x = a[m / c][m % c];
            if (x == t) {
                System.out.println(true);
                return;
            }
            if (x < t)
                l = m + 1;
            else
                h = m - 1;
        }
        System.out.println(false);
    }
}
