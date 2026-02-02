import java.io.*;

public class FilterStudents {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("students.csv"));
        String s;
        r.readLine();
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 4 && Integer.parseInt(x[3]) > 80)
                System.out.println(s);
        }
        r.close();
    }
}
