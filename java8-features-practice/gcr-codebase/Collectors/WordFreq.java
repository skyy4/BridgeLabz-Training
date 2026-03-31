package Collectors;

import java.util.*;
import java.util.stream.*;

public class WordFreq {
    public static void main(String[] a) {
        String t = "java stream java api stream java";
        Map<String, Long> m = Arrays.stream(t.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(m);
    }
}
