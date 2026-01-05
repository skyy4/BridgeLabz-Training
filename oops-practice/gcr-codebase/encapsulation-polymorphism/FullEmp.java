interface Dept {
    void setDept(String d);
    String getDept();
}

abstract class Emp {

    private int id;
    private String nm;
    private double sal;

    public Emp(int id, String nm, double sal) {
        this.id = id;
        this.nm = nm;
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public abstract double calcSal();

    public void show() {
        System.out.println(id + " " + nm + " " + calcSal());
    }
}

public class FullEmp extends Emp implements Dept {

    private String dpt;

    public FullEmp(int id, String nm, double sal) {
        super(id, nm, sal);
    }

    public double calcSal() {
        return getSal();
    }

    public void setDept(String d) {
        dpt = d;
    }

    public String getDept() {
        return dpt;
    }
}

