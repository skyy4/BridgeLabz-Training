package Collectors;

import java.util.*;
import java.util.stream.*;

class Stu {
    String n, g;

    Stu(String n, String g) {
        this.n = n;
        this.g = g;
    }
}

public class StudentGroup {
    public static void main(String[] a) {
        List<Stu> s = List.of(
                new Stu("A", "A"),
                new Stu("B", "B"),
                new Stu("C", "A"));

        Map<String, List<String>> r = s.stream().collect(
                Collectors.groupingBy(
                        x -> x.g,
                        Collectors.mapping(x -> x.n, Collectors.toList())));

        System.out.println(r);
    }
}
