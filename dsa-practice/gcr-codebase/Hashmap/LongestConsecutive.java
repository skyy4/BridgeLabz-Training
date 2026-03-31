import java.util.HashSet;

public class LongestConsecutive {

    static int longest(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a)
            set.add(x);

        int max = 0;
        for (int x : a) {
            if (!set.contains(x - 1)) {
                int c = x, len = 1;
                while (set.contains(c + 1)) {
                    c++;
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longest(a));
    }
}
