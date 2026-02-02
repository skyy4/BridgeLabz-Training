import com.fasterxml.jackson.databind.*;
import java.util.*;

public class MergeMaps {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        Map<String, Object> x = new HashMap<>();
        x.put("a", 1);
        Map<String, Object> y = new HashMap<>();
        y.put("b", 2);
        x.putAll(y);
        System.out.println(m.writeValueAsString(x));
    }
}
