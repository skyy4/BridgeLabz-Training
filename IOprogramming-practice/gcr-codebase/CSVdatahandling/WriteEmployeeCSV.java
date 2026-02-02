import java.io.*;

public class WriteEmployeeCSV {
    public static void main(String[] a) throws Exception {
        FileWriter w = new FileWriter("emp.csv");
        w.write("ID,Name,Dept,Salary\n");
        w.write("1,A,IT,50000\n");
        w.write("2,B,HR,40000\n");
        w.write("3,C,IT,60000\n");
        w.write("4,D,SALES,45000\n");
        w.write("5,E,FIN,70000\n");
        w.close();
    }
}
