package JavaStreams;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, dept;
    double sal;

    Employee(int i, String n, String d, double s) {
        id = i;
        name = n;
        dept = d;
        sal = s;
    }
}

public class SerializeEmp {

    public static void main(String[] args) {
        try {
            List<Employee> l = new ArrayList<>();
            l.add(new Employee(1, "A", "IT", 50000));
            l.add(new Employee(2, "B", "HR", 40000));

            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("emp.dat"));
            o.writeObject(l);
            o.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.dat"));
            List<Employee> r = (List<Employee>) in.readObject();

            for (Employee e : r)
                System.out.println(e.id + " " + e.name + " " + e.sal);

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
