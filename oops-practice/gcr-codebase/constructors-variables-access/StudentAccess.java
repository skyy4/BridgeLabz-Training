public class StudentAccess {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public StudentAccess(int rollNumber,String name,double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }

    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }

    public double getCgpa(){
        return cgpa;
    }
}

class PostgraduateStudent extends StudentAccess {

    public PostgraduateStudent(int roll,String name,double cgpa){
        super(roll,name,cgpa);
    }

    public void display(){
        System.out.println("Roll: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+getCgpa());
    }

    public static void main(String[] args){
        PostgraduateStudent p=new PostgraduateStudent(101,"Amit",8.2);
        p.display();
    }
}

