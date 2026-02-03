import java.util.*;
import java.util.stream.*;

public class TopMovies {
    static class M {
        String n;
        double r;
        int y;

        M(String n, double r, int y) {
            this.n = n;
            this.r = r;
            this.y = y;
        }
    }

    public static void main(String[] a) {
        List<M> l = List.of(
                new M("A", 4.8, 2024),
                new M("B", 4.6, 2023),
                new M("C", 4.9, 2022),
                new M("D", 4.7, 2024),
                new M("E", 4.5, 2021),
                new M("F", 4.4, 2024));
        l.stream().filter(m -> m.y >= 2022)
                .sorted((x, y) -> Double.compare(y.r, x.r))
                .limit(5)
                .forEach(m -> System.out.println(m.n));
    }
}
