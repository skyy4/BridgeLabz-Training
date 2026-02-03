import java.util.*;
import java.util.stream.*;

public class EmailNotify {
    static void send(String e) {
        System.out.println("Mail sent to " + e);
    }

    public static void main(String[] a) {
        List<String> l = List.of("a@mail.com", "b@mail.com");
        l.forEach(EmailNotify::send);
    }
}
