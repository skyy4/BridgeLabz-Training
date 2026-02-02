import java.io.*;

public class IPLCSVProcessor {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("ipl.csv"));
        FileWriter w = new FileWriter("ipl_out.csv");
        w.write(r.readLine() + "\n"); // Write header
        String s;
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 7) {
                x[1] = m(x[1]);
                x[2] = m(x[2]);
                x[5] = m(x[5]);
                x[6] = "REDACTED";
                w.write(String.join(",", x) + "\n");
            }
        }
        r.close();
        w.close();
    }

    static String m(String s) {
        int i = s.indexOf(" ");
        return i == -1 ? s : s.substring(0, i + 1) + "***";
    }
}
