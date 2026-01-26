package JavaStreams;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try {
            File src = new File("a.txt");
            if (!src.exists()) {
                System.out.println("Source file not found");
                return;
            }

            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream("b.txt");

            int ch;
            while ((ch = in.read()) != -1)
                out.write(ch);

            in.close();
            out.close();
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
