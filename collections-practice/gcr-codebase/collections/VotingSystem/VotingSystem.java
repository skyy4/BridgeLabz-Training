package collections.VotingSystem;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args){

        Map<String,Integer> vote=new HashMap<>();
        Map<String,Integer> order=new LinkedHashMap<>();

        cast(vote,order,"A");
        cast(vote,order,"B");
        cast(vote,order,"A");
        cast(vote,order,"C");
        cast(vote,order,"B");

        System.out.println("Vote Order:");
        System.out.println(order);

        Map<String,Integer> sorted=new TreeMap<>(vote);
        System.out.println("Sorted Result:");
        System.out.println(sorted);
    }

    static void cast(Map<String,Integer> v,Map<String,Integer> o,String c){
        v.put(c,v.getOrDefault(c,0)+1);
        o.put(c,v.get(c));
    }
}