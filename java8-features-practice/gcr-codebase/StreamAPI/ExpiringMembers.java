import java.util.*;
import java.time.*;
import java.util.stream.*;

public class ExpiringMembers {
    static class M {
        String n;
        LocalDate d;

        M(String n, LocalDate d) {
            this.n = n;
            this.d = d;
        }
    }

    public static void main(String[] a) {
        List<M> l = List.of(
                new M("Tom", LocalDate.now().plusDays(10)),
                new M("Bob", LocalDate.now().plusDays(40)));
        l.stream()
                .filter(m -> m.d.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.n));
    }
}
