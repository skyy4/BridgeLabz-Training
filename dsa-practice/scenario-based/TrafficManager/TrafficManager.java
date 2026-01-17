class Vehicle {
    String num;
    Vehicle next;

    Vehicle(String num) {
        this.num = num;
    }
}

public class TrafficManager {

    Vehicle head = null, tail = null;

    String[] q = new String[5];
    int f = 0, r = 0;

    void enqueue(String car) {
        if (r == q.length) {
            System.out.println("Queue Overflow");
            return;
        }
        q[r++] = car;
    }

    void addCar() {
        if (f == r) {
            System.out.println("Queue Underflow");
            return;
        }

        Vehicle v = new Vehicle(q[f++]);

        if (head == null) {
            head = tail = v;
            v.next = head;
        } else {
            tail.next = v;
            v.next = head;
            tail = v;
        }
    }

    void removeCar() {
        if (head == null) {
            System.out.println("Roundabout Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("No vehicles");
            return;
        }
        Vehicle t = head;
        do {
            System.out.print(t.num + " ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }

    public static void main(String[] args) {
        TrafficManager t = new TrafficManager();
        t.enqueue("KA01");
        t.enqueue("TN22");
        t.addCar();
        t.addCar();
        t.display();
        t.removeCar();
        t.display();
    }
}
