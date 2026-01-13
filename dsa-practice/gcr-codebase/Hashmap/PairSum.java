import java.util.HashMap;

public class PairSum {

    static boolean pair(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            if (map.containsKey(k - x))
                return true;
            map.put(x, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 8, 4, 1, 6 };
        System.out.println(pair(a, 10));
    }
}
