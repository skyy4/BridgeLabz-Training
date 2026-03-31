public class DayOfWeek {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0, x, m0, d0;

        // Compute adjusted year value
        y0 = y - (14 - m) / 12;

        // Compute year-based offset
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Compute adjusted month value
        m0 = m + 12 * ((14 - m) / 12) - 2;

        // Compute day of week
        d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);
    }
}