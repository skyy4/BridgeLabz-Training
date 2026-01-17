public class FirstNegative {
    public static void main(String[] args) {
        int[] a = { 5, 2, -3, 7 };
        int idx = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
