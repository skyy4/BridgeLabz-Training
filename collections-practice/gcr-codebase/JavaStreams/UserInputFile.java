package JavaStreams;

import java.io.*;

public class UserInputFile {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("user.txt");

            System.out.print("Name: ");
            fw.write("Name: " + br.readLine() + "\n");

            System.out.print("Age: ");
            fw.write("Age: " + br.readLine() + "\n");

            System.out.print("Lang: ");
            fw.write("Lang: " + br.readLine() + "\n");

            fw.close();
            System.out.println("Saved");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
