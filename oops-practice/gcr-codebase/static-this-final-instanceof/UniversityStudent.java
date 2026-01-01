public class UniversityStudent {
    private String name,grade;
    private final int rollNumber;
    private static String universityName="Global University";
    private static int totalStudents=0;

    public UniversityStudent(int rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        totalStudents++;
    }

    public static void displayTotalStudents(){
        System.out.println("Total Students Enrolled: "+totalStudents);
    }

    public void updateGrade(String grade){
        this.grade=grade;
        System.out.println("Grade updated to: "+grade);
    }

    public void display(Object obj){
        if(obj instanceof UniversityStudent){
            System.out.println("University Name: "+universityName);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Name: "+name);
            System.out.println("Grade: "+grade);
        }
    }

    public static void main(String[] args){
        UniversityStudent s1=new UniversityStudent(101,"Hemashree","A");
        UniversityStudent s2=new UniversityStudent(102,"Sharmila","B");
        UniversityStudent.displayTotalStudents();
        s1.display(s1);
        s2.display(s2);
        s2.updateGrade("A");
        s2.display(s2);
    }
}

