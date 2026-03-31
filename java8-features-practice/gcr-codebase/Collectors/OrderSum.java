package Collectors;

import java.util.*;
import java.util.stream.*;

class Ord {
    String c;
    double t;

    Ord(String c, double t) {
        this.c = c;
        this.t = t;
    }
}

public class OrderSum {
    public static void main(String[] a) {
        List<Ord> o = List.of(
                new Ord("Tom", 100),
                new Ord("Tom", 200),
                new Ord("Ana", 150));

        Map<String, Double> r = o.stream().collect(
                Collectors.groupingBy(x -> x.c, Collectors.summingDouble(x -> x.t)));

        System.out.println(r);
    }
}
