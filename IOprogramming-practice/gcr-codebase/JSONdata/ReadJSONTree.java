import com.fasterxml.jackson.databind.*;
import java.io.*;

public class ReadJSONTree {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        JsonNode n = m.readTree(new File("users.json"));
        for (JsonNode x : n)
            System.out.println(x.get("name") + " " + x.get("email"));
    }
}
