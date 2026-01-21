package collections;

import java.util.*;

public class SetOperations {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 2, 1));

        System.out.println(set1.equals(set2));

        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(union);
        System.out.println(intersection);

        Set<Integer> symDiff = new HashSet<>(a);
        symDiff.addAll(b);

        Set<Integer> common = new HashSet<>(a);
        common.retainAll(b);

        symDiff.removeAll(common);

        System.out.println(symDiff);

        Set<Integer> numSet = new HashSet<>(Set.of(5, 3, 9, 1));
        List<Integer> sortedList = new ArrayList<>(numSet);
        Collections.sort(sortedList);

        System.out.println(sortedList);

        Set<Integer> subSet = Set.of(2, 3);
        Set<Integer> mainSet = Set.of(1, 2, 3, 4);

        System.out.println(mainSet.containsAll(subSet));
    }
}