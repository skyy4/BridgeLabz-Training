package JavaStreams;

import java.io.*;

public class LowerCaseFile {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s.toLowerCase());
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
