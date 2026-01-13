import java.util.Queue;
import java.util.LinkedList;

public class CircularTour {

    static int tour(int[] petrol, int[] dist) {
        int start = 0, bal = 0, def = 0;

        for (int i = 0; i < petrol.length; i++) {
            bal += petrol[i] - dist[i];
            if (bal < 0) {
                def += bal;
                start = i + 1;
                bal = 0;
            }
        }
        return (bal + def >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] p = { 6, 3, 7 };
        int[] d = { 4, 6, 3 };
        System.out.println(tour(p, d));
    }
}
