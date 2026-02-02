import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class IPLAnalysis {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        List<Map<String, Object>> l = m.readValue(new File("ipl.json"), List.class);
        for (Map<String, Object> x : l) {
            x.put("team1", mask(x.get("team1").toString()));
            x.put("team2", mask(x.get("team2").toString()));
            x.put("winner", mask(x.get("winner").toString()));
            x.put("player_of_match", "REDACTED");
            Map<String, Integer> s = (Map<String, Integer>) x.get("score");
            Map<String, Integer> n = new HashMap<>();
            for (String k : s.keySet())
                n.put(mask(k), s.get(k));
            x.put("score", n);
        }
        m.writerWithDefaultPrettyPrinter().writeValue(new File("ipl_out.json"), l);
    }

    static String mask(String s) {
        int i = s.indexOf(" ");
        return i == -1 ? s : s.substring(0, i + 1) + "***";
    }
}
