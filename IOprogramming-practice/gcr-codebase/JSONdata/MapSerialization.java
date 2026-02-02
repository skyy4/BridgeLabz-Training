import com.fasterxml.jackson.databind.*;
import java.util.*;

public class MapSerialization {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        Map<String, Object> s = new HashMap<>();
        s.put("name", "Tom");
        s.put("age", 20);
        s.put("subjects", Arrays.asList("Math", "CS"));
        System.out.println(m.writeValueAsString(s));
    }
}
