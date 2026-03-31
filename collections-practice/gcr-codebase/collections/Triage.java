package collections;

import java.util.*;

public class Triage {

    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->sev(b)-sev(a)
        );

        pq.add("John-3");
        pq.add("Alice-5");
        pq.add("Bob-2");

        while(!pq.isEmpty())
            System.out.println(pq.remove().split("-")[0]);
    }

    static int sev(String s){
        return Integer.parseInt(s.split("-")[1]);
    }
}