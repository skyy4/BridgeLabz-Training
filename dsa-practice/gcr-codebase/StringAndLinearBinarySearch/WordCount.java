import java.io.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        String word = "java";
        int cnt = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++)
                if (arr[i].equalsIgnoreCase(word))
                    cnt++;
        }
        br.close();
        System.out.println(cnt);
    }
}
