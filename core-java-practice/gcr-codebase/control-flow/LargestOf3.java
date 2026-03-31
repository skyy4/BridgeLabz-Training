import java.util.Scanner;

 public class LargestOf3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean isFirstLarg = false;
        boolean isSecondLarg = false;
        boolean isThirdLarg = false;

        //  to check if the first number is larger than the other two
        if (n1 > n2 && n1 > n3) {
            isFirstLarg = true;
        }

        //  to check if the second number is larger than the other two
        if (n2 > n1 && n2 > n3) {
            isSecondLarg = true;
        }

        //  to check if the third number is larger than the other two
        if (n3 > n1 && n3 > n2) {
            isThirdLarg = true;
        }

        System.out.println("Is the first number the largest? " + isFirstLarg);
        System.out.println("Is the second number the largest? " + isSecondLarg);
        System.out.println("Is the third number the largest? " + isThirdLarg);

        sc.close();
    }
}