package JavaStreams;

import java.io.*;

public class ErrorLines {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("log.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                if (s.toLowerCase().contains("error"))
                    System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
