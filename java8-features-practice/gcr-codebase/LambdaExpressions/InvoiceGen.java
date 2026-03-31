import java.util.*;
import java.util.function.*;

class InvoiceGen {
    static class I {
        String id;

        I(String id) {
            this.id = id;
        }

        public String toString() {
            return id;
        }
    }

    public static void main(String[] a) {
        List<String> l = List.of("TX10", "TX20");
        Function<String, I> f = I::new;
        l.stream().map(f).forEach(System.out::println);
    }
}
