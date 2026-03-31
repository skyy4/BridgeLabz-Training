package collections;

import java.util.*;

public class WordFreq {

    public static void main(String[] args){
        String s="Hello world, hello Java!";
        s=s.toLowerCase().replaceAll("[^a-z ]","");

        Map<String,Integer> m=new HashMap<>();

        for(String w:s.split(" "))
            m.put(w,m.getOrDefault(w,0)+1);

        System.out.println(m);
    }
}