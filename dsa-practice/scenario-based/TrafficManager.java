
public class TrafficManager {

    static class Node {
        String car;
        Node next;

        Node(String c) {
            car = c;
        }
    }

    Node head, tail;
    String[] queue = new String[3];
    int f = 0, r = 0;

    void enqueue(String c) {
        if (r == queue.length) {
            System.out.println("Queue full");
            return;
        }
        queue[r++] = c;
    }

    void addCar() {
        if (f == r) {
            System.out.println("Queue empty");
            return;
        }
        Node nn = new Node(queue[f++]);
        if (head == null) {
            head = tail = nn;
            nn.next = head;
            return;
        }
        tail.next = nn;
        nn.next = head;
        tail = nn;
    }

    void display() {
        if (head == null)
            return;
        Node t = head;
        do {
            System.out.print(t.car + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }

    public static void main(String[] args) {
        TrafficManager t = new TrafficManager();
        t.enqueue("Car1");
        t.enqueue("Car2");
        t.addCar();
        t.addCar();
        t.display();
    }
}
