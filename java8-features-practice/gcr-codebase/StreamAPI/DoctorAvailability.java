import java.util.*;
import java.util.stream.*;

public class DoctorAvailability {
    static class D {
        String n, s;
        boolean w;

        D(String n, String s, boolean w) {
            this.n = n;
            this.s = s;
            this.w = w;
        }
    }

    public static void main(String[] a) {
        List<D> l = List.of(
                new D("Ravi", "Cardio", true),
                new D("Asha", "Neuro", false),
                new D("John", "Ortho", true));
        l.stream().filter(d -> d.w)
                .sorted(Comparator.comparing(d -> d.s))
                .forEach(d -> System.out.println(d.n));
    }
}
