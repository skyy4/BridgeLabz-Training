package collections.InsurancePolicyManagement;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>(
        (a,b) -> a.expiryDate.compareTo(b.expiryDate)
    );

    void addPolicy(Policy p){
        hashSet.add(p);
        linkedSet.add(p);
        treeSet.add(p);
    }

    void displayAll(){
        System.out.println("All Policies:");
        for(Policy p:hashSet)
            System.out.println(p);
    }

    void expiringSoon(){
        System.out.println("Policies expiring in 30 days:");
        LocalDate now=LocalDate.now();
        for(Policy p:treeSet){
            if(!p.expiryDate.isAfter(now.plusDays(30)))
                System.out.println(p);
        }
    }

    void byCoverage(String type){
        System.out.println("Coverage Type: "+type);
        for(Policy p:hashSet){
            if(p.coverageType.equalsIgnoreCase(type))
                System.out.println(p);
        }
    }

    void findDuplicates(List<Policy> list){
        Set<String> seen=new HashSet<>();
        System.out.println("Duplicate Policies:");
        for(Policy p:list){
            if(!seen.add(p.policyNumber))
                System.out.println(p.policyNumber);
        }
    }
}