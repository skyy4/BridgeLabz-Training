package collections.InsurancePolicyManagement;

import java.time.LocalDate;
import java.util.Objects;

class Policy {
    String policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(String num,String name,LocalDate date,String type,double premium){
        this.policyNumber=num;
        this.holderName=name;
        this.expiryDate=date;
        this.coverageType=type;
        this.premium=premium;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Policy)) return false;
        Policy p=(Policy)o;
        return policyNumber.equals(p.policyNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(policyNumber);
    }

    public String toString(){
        return policyNumber+" | "+holderName+" | "+coverageType+
               " | Exp: "+expiryDate+" | ₹"+premium;
    }
}