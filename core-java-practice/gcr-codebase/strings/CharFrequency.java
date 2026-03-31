import java.util.Scanner;

public class CharFrequency {

    // Find frequency of characters using charAt()
    public static String[][] findFreq(String txt) {

        int[] freq = new int[256];   // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            freq[ch]++;
        }

        int cnt = 0;

        // Count number of unique characters
        for (int i = 0; i < txt.length(); i++) {
            if (freq[txt.charAt(i)] > 0) {
                cnt++;
                freq[txt.charAt(i)] = -freq[txt.charAt(i)];
            }
        }

        String[][] res = new String[cnt][2];
        int idx = 0;

        // Store character and its frequency
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (freq[ch] < 0) {
                res[idx][0] = String.valueOf(ch);
                res[idx][1] = String.valueOf(-freq[ch]);
                freq[ch] = 0;
                idx++;
            }
        }

        return res;
    }

    // Display frequency table
    public static void show(String[][] arr) {

        System.out.println("Character\tFrequency");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[][] res = findFreq(txt);

        show(res);

        sc.close();
    }
}