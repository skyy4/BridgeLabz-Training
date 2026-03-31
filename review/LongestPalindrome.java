public class LongestPalindrome {
    public static void main(String[] args) {
        String alpha = "abaabacbcbc";

        System.out.println("Longest palindrome is :  " + longestP(alpha));
       
    }

    public static String longestP(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (chkPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    public static boolean chkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}