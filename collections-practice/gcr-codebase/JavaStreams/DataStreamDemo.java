package JavaStreams;

import java.io.*;

public class DataStreamDemo {

    public static void main(String[] args) {
        try {
            DataOutputStream d = new DataOutputStream(new FileOutputStream("stu.dat"));
            d.writeInt(1);
            d.writeUTF("Ram");
            d.writeDouble(8.2);
            d.close();

            DataInputStream in = new DataInputStream(new FileInputStream("stu.dat"));
            System.out.println(in.readInt());
            System.out.println(in.readUTF());
            System.out.println(in.readDouble());
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
