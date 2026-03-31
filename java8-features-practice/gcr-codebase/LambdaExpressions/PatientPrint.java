import java.util.*;

class PatientPrint {
    static void out(String s) {
        System.out.println(s);
    }

    public static void main(String[] a) {
        List<String> l = List.of("P101", "P102");
        l.forEach(PatientPrint::out);
    }
}
