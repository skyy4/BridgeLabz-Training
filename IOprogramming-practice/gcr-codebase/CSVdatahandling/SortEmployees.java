import java.io.*;
import java.util.*;

public class SortEmployees {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("emp.csv"));
        List<String[]> l = new ArrayList<>();
        String s;
        r.readLine(); // Skip header
        while ((s = r.readLine()) != null)
            l.add(s.split(","));

        l.sort((x, y) -> Integer.parseInt(y[3]) - Integer.parseInt(x[3]));

        for (int i = 0; i < Math.min(5, l.size()); i++)
            System.out.println(l.get(i)[1] + " " + l.get(i)[3]);
        r.close();
    }
}
