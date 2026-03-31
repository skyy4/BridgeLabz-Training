package JavaStreams;

import java.io.*;

public class PipeDemo {

    public static void main(String[] args) throws Exception {
        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream in = new PipedInputStream(out);

        Thread t1 = new Thread(() -> {
            try {
                out.write("Hello".getBytes());
                out.close();
            } catch (IOException e) {
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                int c;
                while ((c = in.read()) != -1)
                    System.out.print((char) c);
                in.close();
            } catch (IOException e) {
            }
        });

        t1.start();
        t2.start();
    }
}
