import java.util.Scanner;

public class CharFreqNested {

    // Find character frequency using nested loops
    public static String[] findFreq(String txt) {

        char[] ch = txt.toCharArray();
        int n = ch.length;
        int[] freq = new int[n];

        // Initialize frequency array
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Find frequency using nested loops
        for (int i = 0; i < n; i++) {

            if (ch[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0'; // mark duplicate
                }
            }
        }

        int cnt = 0;

        // Count valid characters
        for (int i = 0; i < n; i++) {
            if (ch[i] != '0') {
                cnt++;
            }
        }

        String[] res = new String[cnt * 2];
        int idx = 0;

        // Store character and frequency in 1D array
        for (int i = 0; i < n; i++) {
            if (ch[i] != '0') {
                res[idx++] = String.valueOf(ch[i]);
                res[idx++] = String.valueOf(freq[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();

        String[] res = findFreq(txt);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < res.length; i += 2) {
            System.out.println(res[i] + "\t\t" + res[i + 1]);
        }

        sc.close();
    }
}