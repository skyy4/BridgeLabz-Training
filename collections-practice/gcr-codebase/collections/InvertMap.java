package collections;

import java.util.*;

public class InvertMap {

    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("A",1);
        m.put("B",2);
        m.put("C",1);

        Map<Integer,List<String>> r=new HashMap<>();

        for(String k:m.keySet()){
            int v=m.get(k);
            if(!r.containsKey(v))
                r.put(v,new ArrayList<>());
            r.get(v).add(k);
        }

        System.out.println(r);
    }
}