public class HospitalPatient {
    private String name,ailment;
    private int age;
    private final String patientID;
    private static String hospitalName="City Hospital";
    private static int totalPatients=0;

    public HospitalPatient(String patientID,String name,int age,String ailment){
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        totalPatients++;
    }

    public static void getTotalPatients(){
        System.out.println("Total Patients Admitted: "+totalPatients);
    }

    public void display(Object obj){
        if(obj instanceof HospitalPatient){
            System.out.println("Hospital Name: "+hospitalName);
            System.out.println("Patient ID: "+patientID);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Ailment: "+ailment);
        }
    }

    public static void main(String[] args){
        HospitalPatient p1=new HospitalPatient("P001","Lathika",30,"Flu");
        HospitalPatient p2=new HospitalPatient("P002","Lidiya",45,"Fracture");
        HospitalPatient.getTotalPatients();
        p1.display(p1);
        p2.display(p2);
    }
}

