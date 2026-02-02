import java.io.*;

public class ModifyEmployeeCSV {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("emp.csv"));
        FileWriter w = new FileWriter("out.csv");
        w.write(r.readLine() + "\n"); // Write header
        String s;
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 4 && x[2].equals("IT"))
                x[3] = String.valueOf((int) (Integer.parseInt(x[3]) * 1.1));
            w.write(String.join(",", x) + "\n");
        }
        r.close();
        w.close();
    }
}
