import java.io.*;

public class ReadUsingISR {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);

        br.close();
    }
}
