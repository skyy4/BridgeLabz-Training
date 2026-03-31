import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String res = "";

        // Remove duplicate characters using charAt()
        for (int i = 0; i < txt.length(); i++) {

            char ch = txt.charAt(i);
            boolean found = false;

            // Check if character already exists in result
            for (int j = 0; j < res.length(); j++) {
                if (res.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                res = res + ch;
            }
        }

        System.out.println("String after removing duplicates: " + res);

        sc.close();
    }
}