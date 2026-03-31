import java.util.*;
import java.util.stream.*;

public class InsuranceClaims {
    static class C {
        String t;
        double a;

        C(String t, double a) {
            this.t = t;
            this.a = a;
        }
    }

    public static void main(String[] a) {
        List<C> l = List.of(
                new C("Health", 5000),
                new C("Health", 7000),
                new C("Auto", 3000));
        l.stream()
                .collect(Collectors.groupingBy(c -> c.t,
                        Collectors.averagingDouble(c -> c.a)))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }
}
