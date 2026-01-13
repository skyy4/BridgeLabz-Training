import java.util.HashMap;

public class TwoSum {

    static void find(int[] a, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(t - a[i])) {
                System.out.println(map.get(t - a[i]) + " " + i);
                return;
            }
            map.put(a[i], i);
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        find(a, 9);
    }
}
