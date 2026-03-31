import java.util.*;
import java.util.stream.*;

public class NameTransform {
    public static void main(String[] a) {
        List<String> l = List.of("ram", "adam", "john");
        l.stream().map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
