import com.fasterxml.jackson.databind.*;
import java.util.*;

public class ListSerialization {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        List<String> l = Arrays.asList("A", "B", "C");
        System.out.println(m.writeValueAsString(l));
    }
}
