import java.util.Scanner;

public class Copy2Dto1D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[r * c];
        int idx = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[idx] = mat[i][j];
                idx++;
            }
        }

        // Display elements of 1D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}