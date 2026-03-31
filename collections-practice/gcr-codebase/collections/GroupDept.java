package collections;
import java.util.*;

public class GroupDept {

    public static void main(String[] args){
        String[][] e={
            {"Alice","HR"},
            {"Bob","IT"},
            {"Carol","HR"}
        };

        Map<String,List<String>> m=new HashMap<>();

        for(String[] x:e){
            if(!m.containsKey(x[1]))
                m.put(x[1],new ArrayList<>());
            m.get(x[1]).add(x[0]);
        }

        System.out.println(m);
    }
}