package collections.InsurancePolicyManagement;

import java.time.LocalDate;
import java.util.*;

public class InsuranceTest {
    public static void main(String[] args){

        PolicyManager m=new PolicyManager();

        Policy p1=new Policy("P101","Ravi",
            LocalDate.now().plusDays(10),"Health",8000);
        Policy p2=new Policy("P102","Anita",
            LocalDate.now().plusDays(40),"Auto",6000);
        Policy p3=new Policy("P103","Suresh",
            LocalDate.now().plusDays(20),"Home",12000);
        Policy p4=new Policy("P101","Ravi Duplicate",
            LocalDate.now().plusDays(15),"Health",9000);

        m.addPolicy(p1);
        m.addPolicy(p2);
        m.addPolicy(p3);
        m.addPolicy(p4);

        m.displayAll();
        m.expiringSoon();
        m.byCoverage("Health");

        List<Policy> list=Arrays.asList(p1,p2,p3,p4);
        m.findDuplicates(list);

        PerformanceTest.test(new HashSet<>(),"HashSet");
        PerformanceTest.test(new LinkedHashSet<>(),"LinkedHashSet");
        PerformanceTest.test(new TreeSet<>(
            (a,b)->a.expiryDate.compareTo(b.expiryDate)
        ),"TreeSet");
    }
}