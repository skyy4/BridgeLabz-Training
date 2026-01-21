package collections;

import java.util.*;

public class ReverseQueue {

    static void rev(Queue<Integer> q){
        if(q.isEmpty()) return;
        int x=q.remove();
        rev(q);
        q.add(x);
    }

    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        rev(q);
        System.out.println(q);
    }
}