import java.io.*;
import java.util.regex.*;

public class ValidateCSVData {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("data.csv"));
        Pattern e = Pattern.compile("^[\\w.+-]+@[\\w.-]+$");
        Pattern p = Pattern.compile("\\d{10}");
        String s;
        r.readLine();
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            // Assuming index 2 is email and index 3 is phone, per original snippet logic
            if (x.length >= 4 && (!e.matcher(x[2]).matches() || !p.matcher(x[3]).matches()))
                System.out.println("Invalid " + s);
        }
        r.close();
    }
}
