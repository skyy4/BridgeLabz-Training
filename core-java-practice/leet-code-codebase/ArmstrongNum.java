
public class ArmstrongNum {

    // Number ke digits count karne ke liye
    public static int length(int N) {
        int length = 0;

        while (N != 0) {
            N = N / 10;   // Last digit hata di
            length++;    // Count badhaya
        }

        return length;
    }

    // Armstrong number check karne ka function
    public static boolean isArmstrongNumber(int N, int k) {

        int sum = 0;   // Power ka total sum
        int n = N;     // Original number ka copy

        while (n != 0) {

            int rem = n % 10;   // Last digit nikali
            int power = 1;

            // rem ka k-th power manually calculate kiya
            for (int i = 0; i < k; i++) {
                power = power * rem;
            }

            sum = sum + power;  // Power ko sum mein add kiya
            n = n / 10;         // Last digit hata di
        }

        // Agar sum original number ke barabar hai
        return sum == N;
    }

   
    public static void main(String[] args) {

        int N = 153;           
        int k = length(N);     

        System.out.println(isArmstrongNumber(N, k));
    }
}