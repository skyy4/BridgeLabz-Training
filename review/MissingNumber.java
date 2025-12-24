  import java.util.*;

 public class MissingNumber {
    public static int funct(int[] arr) {
        int n = arr.length + 1; 
            int exp = n * (n + 1) / 2;
            int ac = 0;

        // for (int num : arr) {
        //     ac += num;
        // }
    
        for(int i=0;i<arr.length;i++){
            ac += arr[i];
        }  
        return exp - ac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];  
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
        int mn = funct(arr);
        System.out.println("missing no: " + mn);
    }
    
}
