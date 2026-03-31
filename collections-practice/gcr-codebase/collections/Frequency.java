package collections;

import java.util.*;

public class Frequency {

    public static void main(String[] args){
        List<String> list=List.of("apple","banana","apple","orange");
        Map<String,Integer> map=new HashMap<>();

        for(String s:list)
            map.put(s,map.getOrDefault(s,0)+1);

        System.out.println(map);
    }
}