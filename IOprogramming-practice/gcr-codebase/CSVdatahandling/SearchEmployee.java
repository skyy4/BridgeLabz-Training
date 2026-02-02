import java.io.*;

public class SearchEmployee {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("emp.csv"));
        String k = "A", s;
        r.readLine();
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 4 && x[1].equalsIgnoreCase(k))
                System.out.println(x[2] + " " + x[3]);
        }
        r.close();
    }
}
