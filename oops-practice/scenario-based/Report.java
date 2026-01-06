import java.util.ArrayList;

public class Report {

    static class Stu {
        String nm;
        int[] mk;

        Stu(String nm, int[] mk) {
            for (int n : mk) {
                if (n < 0 || n > 100) {
                    throw new IllegalArgumentException("Invalid marks");
                }
            }
            this.nm = nm;
            this.mk = mk;
        }
    }

    static ArrayList<Stu> list = new ArrayList<>();

    // Calculate average
    public static int avg(int[] m) {
        int s = 0;
        for (int n : m) s += n;
        return s / m.length;
    }

    // Assign grade
    public static String grd(int a) {
        if (a >= 75) return "A";
        if (a >= 50) return "B";
        return "C";
    }

    public static void main(String[] args) {

        int[] m1 = {80, 70, 90};
        list.add(new Stu("Neha", m1));

        for (Stu s : list) {
            int a = avg(s.mk);
            System.out.println(s.nm + " Avg=" + a + " Grade=" + grd(a));
        }
    }
}

