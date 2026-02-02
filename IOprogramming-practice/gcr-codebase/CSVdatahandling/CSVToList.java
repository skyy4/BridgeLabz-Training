import java.io.*;
import java.util.*;

class Student {
    int i;
    String n;
    int a;
    int m;

    Student(int i, String n, int a, int m) {
        this.i = i;
        this.n = n;
        this.a = a;
        this.m = m;
    }
}

public class CSVToList {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("students.csv"));
        List<Student> l = new ArrayList<>();
        String s;
        r.readLine(); // Skip header
        while ((s = r.readLine()) != null) {
            String[] x = s.split(",");
            if (x.length >= 4) {
                l.add(new Student(Integer.parseInt(x[0]), x[1], Integer.parseInt(x[2]), Integer.parseInt(x[3])));
            }
        }
        for (Student o : l)
            System.out.println(o.n);
        r.close();
    }
}
