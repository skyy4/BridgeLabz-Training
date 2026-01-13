import java.util.HashMap;

public class ZeroSumSubarray {

    static boolean check(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int x : a) {
            sum += x;
            if (sum == 0 || map.containsKey(sum))
                return true;
            map.put(sum, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 4, 2, -3, 1, 6 };
        System.out.println(check(a));
    }
}
