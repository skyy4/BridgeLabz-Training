package ClassroomAttendance;

import java.util.*;

class DuplicateAttendanceException extends Exception {
    DuplicateAttendanceException(String m) {
        super(m);
    }
}

class Attendance {
    Map<String, Set<String>> m = new HashMap<>();

    void mark(String s, String id) throws DuplicateAttendanceException {
        m.putIfAbsent(s, new HashSet<>());
        if (!m.get(s).add(id))
            throw new DuplicateAttendanceException("Attendance already marked");
    }

    void show() {
        System.out.println(m);
    }
}

public class Classroom {
    public static void main(String[] a) {
        try {
            Attendance at = new Attendance();
            at.mark("S1", "U1");
            at.mark("S1", "U2");
            at.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
