import java.util.*;

class Table {
    int no;
    boolean booked;

    Table(int no) {
        this.no = no;
        this.booked = false;
    }
}

class Reservation {
    int tno;
    String time;

    Reservation(int tno, String time) {
        this.tno = tno;
        this.time = time;
    }
}

class TableAlreadyReservedException extends Exception {
}

public class Restaurant {

    static Map<Integer, Table> tables = new HashMap<>();
    static List<Reservation> list = new ArrayList<>();

    static void reserveTable(int no, String time)
            throws TableAlreadyReservedException {

        Table t = tables.get(no);
        if (t.booked)
            throw new TableAlreadyReservedException();

        t.booked = true;
        list.add(new Reservation(no, time));
        System.out.println("Table " + no + " reserved at " + time);
    }

    static void cancelReservation(int no) {
        tables.get(no).booked = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).tno == no) {
                list.remove(i);
                break;
            }
        }
        System.out.println("Reservation cancelled for table " + no);
    }

    static void showAvailableTables() {
        System.out.print("Available tables: ");
        for (int k : tables.keySet()) {
            if (!tables.get(k).booked)
                System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            tables.put(i, new Table(i));

        try {
            reserveTable(2, "7PM");
            reserveTable(4, "8PM");
            reserveTable(2, "9PM");
        } catch (TableAlreadyReservedException e) {
            System.out.println("Table already reserved");
        }

        showAvailableTables();
        cancelReservation(2);
        showAvailableTables();

    }

}
