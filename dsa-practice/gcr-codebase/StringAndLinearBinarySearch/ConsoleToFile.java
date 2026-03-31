import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter("out.txt");

        String s;
        while (true) {
            s = br.readLine();
            if (s.equals("exit"))
                break;
            fw.write(s + "\n");
        }
        fw.close();
    }
}
