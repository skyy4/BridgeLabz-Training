import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    static void max(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < a.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i])
                dq.pollLast();

            dq.addLast(i);

            if (i >= k - 1)
                System.out.print(a[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };
        max(a, 3);
    }
}
