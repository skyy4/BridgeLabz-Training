class BaseEmployee {
    String name;
    int id;
    double salary;

    public BaseEmployee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}

public class Manager extends BaseEmployee {
    int teamSize;

    public Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}

