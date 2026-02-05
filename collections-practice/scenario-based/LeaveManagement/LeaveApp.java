package LeaveManagement;

import java.util.*;

class Emp {
    int id;
    int bal;

    Emp(int id, int bal) {
        this.id = id;
        this.bal = bal;
    }
}

class LeaveReq {
    int id, days;

    LeaveReq(int id, int days) {
        this.id = id;
        this.days = days;
    }
}

class InsufficientLeaveBalanceException extends Exception {
    InsufficientLeaveBalanceException(String m) {
        super(m);
    }
}

class LeaveService {
    Map<Integer, Emp> em = new HashMap<>();
    List<LeaveReq> lr = new ArrayList<>();

    void apply(int id, int d) throws InsufficientLeaveBalanceException {
        Emp e = em.get(id);
        if (e.bal < d)
            throw new InsufficientLeaveBalanceException("Insufficient balance");
        e.bal -= d;
        lr.add(new LeaveReq(id, d));
        System.out.println("Leave approved");
    }
}

public class LeaveApp {
    public static void main(String[] a) {
        try {
            LeaveService l = new LeaveService();
            l.em.put(1, new Emp(1, 5));
            l.apply(1, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
