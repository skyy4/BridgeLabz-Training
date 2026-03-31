package collections;
import java.util.*;

public class MergeMap {

    public static void main(String[] args){
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();

        m1.put("A",1);
        m1.put("B",2);
        m2.put("B",3);
        m2.put("C",4);

        for(String k:m2.keySet())
            m1.put(k,m1.getOrDefault(k,0)+m2.get(k));

        System.out.println(m1);
    }
}