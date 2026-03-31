class Stage {
    String name;
    Stage next;

    Stage(String name) {
        this.name = name;
        this.next = null;
    }
}

public class ParcelTracker {

    Stage head;

    void addStage(String name) {
        Stage s = new Stage(name);
        if (head == null) {
            head = s;
            return;
        }
        Stage t = head;
        while (t.next != null)
            t = t.next;
        t.next = s;
    }

    void addCheckpoint(String after, String name) {
        Stage t = head;
        while (t != null) {
            if (t.name.equals(after)) {
                Stage s = new Stage(name);
                s.next = t.next;
                t.next = s;
                return;
            }
            t = t.next;
        }
        System.out.println("Stage not found");
    }

    void track() {
        if (head == null) {
            System.out.println("Parcel lost");
            return;
        }
        Stage t = head;
        while (t != null) {
            System.out.print(t.name);
            if (t.next != null)
                System.out.print(" -> ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ParcelTracker p = new ParcelTracker();
        p.addStage("Packed");
        p.addStage("Shipped");
        p.addStage("In Transit");
        p.addStage("Delivered");

        p.track();

        p.addCheckpoint("Shipped", "Custom Checkpoint");
        p.track();
    }
}
