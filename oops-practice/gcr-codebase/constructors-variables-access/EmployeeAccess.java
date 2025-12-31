public class EmployeeAccess {
    public int employeeID;
    protected String department;
    private double salary;

    public EmployeeAccess(int id,String department,double salary){
        this.employeeID=id;
        this.department=department;
        this.salary=salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}

class Manager extends EmployeeAccess {

    public Manager(int id,String dept,double sal){
        super(id,dept,sal);
    }

    public void display(){
        System.out.println("ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+getSalary());
    }

    public static void main(String[] args){
        Manager m=new Manager(1,"IT",90000);
        m.display();
    }
}

