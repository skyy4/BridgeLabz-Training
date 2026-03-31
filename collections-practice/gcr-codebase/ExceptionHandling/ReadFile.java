import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String s;
            while ((s = br.readLine()) != null)
                System.out.println(s);
            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
