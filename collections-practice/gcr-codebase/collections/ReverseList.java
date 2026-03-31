package collections;

import java.util.*;

public class ReverseList {

    static <T> void reverse(List<T> list){
        int i=0,j=list.size()-1;
        while(i<j){
            T t=list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
            i++; j--;
        }
    }

    public static void main(String[] args){
        List<Integer> a=new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> l=new LinkedList<>(a);

        reverse(a);
        reverse(l);

        System.out.println(a);
        System.out.println(l);
    }
}