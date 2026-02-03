import java.util.*;
import java.time.*;
import java.util.stream.*;

public class TransactionLogger {
    public static void main(String[] a) {
        List<String> l = List.of("TX1", "TX2");
        l.forEach(i -> System.out.println(LocalDateTime.now() + " - " + i));
    }
}
