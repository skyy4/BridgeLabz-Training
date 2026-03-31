import java.util.*;

class UpperNames {
    public static void main(String[] a) {
        List<String> l = List.of("ram", "john");
        l.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
