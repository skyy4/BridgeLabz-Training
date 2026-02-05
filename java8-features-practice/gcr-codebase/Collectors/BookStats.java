package Collectors;

import java.util.*;
import java.util.stream.*;

class Book {
    String g;
    int p;

    Book(String g, int p) {
        this.g = g;
        this.p = p;
    }
}

public class BookStats {
    public static void main(String[] a) {
        List<Book> b = List.of(
                new Book("Sci", 300),
                new Book("Sci", 500),
                new Book("Art", 200));

        Map<String, IntSummaryStatistics> r = b.stream().collect(
                Collectors.groupingBy(
                        x -> x.g,
                        Collectors.summarizingInt(x -> x.p)));

        System.out.println(r);
    }
}
