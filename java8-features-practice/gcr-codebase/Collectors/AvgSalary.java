package Collectors;

import java.util.*;
import java.util.stream.*;

class Emp {
    String d;
    double s;

    Emp(String d, double s) {
        this.d = d;
        this.s = s;
    }

    String getDepartment() {
        return d;
    }

    double getSalary() {
        return s;
    }
}

public class AvgSalary {
    public static void main(String[] a) {
        List<Emp> e = List.of(
                new Emp("IT", 60000),
                new Emp("IT", 80000),
                new Emp("HR", 40000));

        Map<String, Double> r = e.stream().collect(
                Collectors.groupingBy(
                        Emp::getDepartment,
                        Collectors.averagingDouble(Emp::getSalary)));

        System.out.println(r);
    }
}
