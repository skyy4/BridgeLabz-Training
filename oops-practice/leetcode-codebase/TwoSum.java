import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Map<Integer, Integer> seen = new HashMap<>();
        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                first = seen.get(complement);
                second = i;
                break;
            }
            seen.put(nums[i], i);
        }
        if (first == -1) {
            System.out.println("No pair");
        } else {
            System.out.println(first + " " + second);
        }
        sc.close();
    }
}

