package JavaStreams;

import java.io.*;

public class BufferedCopy {

    static void normal() throws Exception {
        FileInputStream in = new FileInputStream("big.dat");
        FileOutputStream out = new FileOutputStream("ncopy.dat");
        byte[] b = new byte[4096];
        int n;
        while ((n = in.read(b)) != -1)
            out.write(b, 0, n);
        in.close();
        out.close();
    }

    static void buffered() throws Exception {
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("big.dat"));
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("bcopy.dat"));
        byte[] b = new byte[4096];
        int n;
        while ((n = in.read(b)) != -1)
            out.write(b, 0, n);
        in.close();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        long s = System.nanoTime();
        normal();
        long e = System.nanoTime();
        System.out.println("Normal: " + (e - s));

        s = System.nanoTime();
        buffered();
        e = System.nanoTime();
        System.out.println("Buffered: " + (e - s));
    }
}
