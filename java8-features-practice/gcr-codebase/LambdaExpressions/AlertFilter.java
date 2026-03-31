import java.util.*;
import java.util.function.*;

class AlertFilter {
    public static void main(String[] a) {
        List<String> l = List.of("Critical", "Info", "Emergency");
        Predicate<String> p = s -> s.equals("Critical") || s.equals("Emergency");
        l.stream().filter(p).forEach(System.out::println);
    }
}
