import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("big.csv"));
        int c = 0;
        String s;
        while ((s = r.readLine()) != null) {
            c++;
            if (c % 100 == 0)
                System.out.println(c);
        }
        r.close();
    }
}
