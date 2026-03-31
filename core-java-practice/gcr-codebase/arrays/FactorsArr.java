import java.util.Scanner;

public class FactorsArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 10;
        int[] fac = new int[max];
        int idx = 0;

        // Find factors and store them in the array
        for (int i = 1; i <= n; i++) {

            // Check if i is a factor of the number
            if (n % i == 0) {

                // Increase array size if limit is reached
                if (idx == max) {
                    max = max * 2;
                    int[] tmp = new int[max];

                    for (int j = 0; j < idx; j++) {
                        tmp[j] = fac[j];
                    }

                    fac = tmp;
                }

                fac[idx] = i;
                idx++;
            }
        }

        // Display all factors stored in the array
        for (int i = 0; i < idx; i++) {
            System.out.println(fac[i]);
        }

        sc.close();
    }
}