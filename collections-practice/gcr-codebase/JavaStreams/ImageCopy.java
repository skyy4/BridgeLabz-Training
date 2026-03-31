package JavaStreams;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("img.jpg");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();

            int c;
            while ((c = in.read()) != -1)
                bout.write(c);

            byte[] arr = bout.toByteArray();

            ByteArrayInputStream bin = new ByteArrayInputStream(arr);
            FileOutputStream out = new FileOutputStream("new.jpg");

            while ((c = bin.read()) != -1)
                out.write(c);

            in.close();
            out.close();
            System.out.println("Image copied");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
