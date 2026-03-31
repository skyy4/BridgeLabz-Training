package collections;

import java.util.*;

public class RotateList {

    static void rotate(List<Integer> list,int k){
        k%=list.size();
        List<Integer> temp=new ArrayList<>();

        for(int i=k;i<list.size();i++) temp.add(list.get(i));
        for(int i=0;i<k;i++) temp.add(list.get(i));

        list.clear();
        list.addAll(temp);
    }

    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(List.of(10,20,30,40,50));
        rotate(list,2);
        System.out.println(list);
    }
}