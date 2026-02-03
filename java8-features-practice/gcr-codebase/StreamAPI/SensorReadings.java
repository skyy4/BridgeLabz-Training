import java.util.*;
import java.util.stream.*;

public class SensorReadings {
    static class S {
        int v;

        S(int v) {
            this.v = v;
        }
    }

    public static void main(String[] a) {
        List<S> l = List.of(new S(45), new S(80));
        l.stream().filter(s -> s.v > 50)
                .forEach(s -> System.out.println(s.v));
    }
}
