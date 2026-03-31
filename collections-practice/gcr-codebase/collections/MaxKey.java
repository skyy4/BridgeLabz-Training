package collections;

import java.util.*;

public class MaxKey {

    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("A",10);
        m.put("B",20);
        m.put("C",15);

        String ans="";
        int max=-1;

        for(String k:m.keySet()){
            if(m.get(k)>max){
                max=m.get(k);
                ans=k;
            }
        }

        System.out.println(ans);
    }
}