package JavaStreams;

import java.io.*;
import java.util.*;

public class WordCountTop {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            Map<String, Integer> m = new HashMap<>();
            String s;

            while ((s = br.readLine()) != null) {
                s = s.toLowerCase().replaceAll("[^a-z ]", "");
                for (String w : s.split(" "))
                    if (!w.isEmpty())
                        m.put(w, m.getOrDefault(w, 0) + 1);
            }

            List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
            l.sort((a, b) -> b.getValue() - a.getValue());

            for (int i = 0; i < 5 && i < l.size(); i++)
                System.out.println(l.get(i));

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
