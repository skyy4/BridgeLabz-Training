import com.fasterxml.jackson.databind.*;
import java.io.*;

public class FilterJSONData {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        JsonNode n = m.readTree(new File("data.json"));
        for (JsonNode x : n)
            if (x.get("age").asInt() > 25)
                System.out.println(x);
    }
}
