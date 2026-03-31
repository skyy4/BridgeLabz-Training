
import java.util.Stack;

class Page {
    String url;
    Page prev, next;

    Page(String url) {
        this.url = url;
    }
}

public class BrowserBuddy {

    Page cur;
    Stack<Page> closed = new Stack<>();

    void visit(String url) {
        Page p = new Page(url);
        if (cur != null) {
            cur.next = p;
            p.prev = cur;
        }
        cur = p;
    }

    void back() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }

    void forward() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }

    void closeTab() {
        if (cur == null)
            return;
        closed.push(cur);
        cur = cur.prev;
        if (cur != null)
            cur.next = null;
    }

    void restoreTab() {
        if (closed.isEmpty())
            return;
        Page p = closed.pop();
        if (cur != null) {
            cur.next = p;
            p.prev = cur;
        }
        cur = p;
    }

    void show() {
        if (cur != null)
            System.out.println("Current: " + cur.url);
    }

    public static void main(String[] args) {
        BrowserBuddy b = new BrowserBuddy();
        b.visit("google.com");
        b.visit("github.com");
        b.back();
        b.show();
        b.closeTab();
        b.restoreTab();
        b.show();
    }
}
