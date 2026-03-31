import java.util.function.*;

class StrLen {
    public static void main(String[] a) {
        Function<String, Integer> f = String::length;
        System.out.println(f.apply("Hello"));
    }
}
