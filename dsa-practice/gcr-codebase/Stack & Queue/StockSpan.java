import java.util.Stack;

public class StockSpan {

    static void span(int[] a) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print("1 ");

        for (int i = 1; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] <= a[i])
                st.pop();
            System.out.print((st.isEmpty() ? i + 1 : i - st.peek()) + " ");
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        span(price);
    }
}
