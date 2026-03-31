import java.util.Stack;

public class SortStack {

    static void sort(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int x = st.pop();
        sort(st);
        insert(st, x);
    }

    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int t = st.pop();
        insert(st, x);
        st.push(t);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        sort(st);
        System.out.println(st);
    }
}
