import java.util.*;
import java.util.stream.*;

public class EventWelcome {
    public static void main(String[] a) {
        List<String> l = List.of("Alex", "Maya");
        l.forEach(x -> System.out.println("Welcome " + x));
    }
}
