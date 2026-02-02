import java.io.*;

public class ReadStudentCSV {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("students.csv"));
        String s;
        r.readLine(); // Skip header
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 4) {
                System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3]);
            }
        }
        r.close();
    }
}
