public class CompanyEmployee {
    private String name,designation;
    private final int id;
    private static String companyName="Tech Solutions Inc.";
    private static int totalEmployees=0;

    public CompanyEmployee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }

    public void display(Object obj){
        if(obj instanceof CompanyEmployee){
            System.out.println("Company Name: "+companyName);
            System.out.println("Employee ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
        }
    }

    public static void main(String[] args){
        CompanyEmployee e1=new CompanyEmployee("Thamarai",101,"Software Engineer");
        CompanyEmployee e2=new CompanyEmployee("Rohan",102,"Project Manager");
        CompanyEmployee.displayTotalEmployees();
        e1.display(e1);
        e2.display(e2);
    }
}

