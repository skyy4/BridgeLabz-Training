import java.io.*;

public class CountCSVLines {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("data.csv"));
        int c = -1; // Start at -1 to exclude header
        while (r.readLine() != null)
            c++;
        System.out.println(c);
        r.close();
    }
}
