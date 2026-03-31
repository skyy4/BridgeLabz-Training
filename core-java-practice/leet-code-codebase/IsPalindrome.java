 public class IsPalindrome {

    public static boolean ispalindrome(String s) {

        // Ek naya StringBuilder banaya
        // jisme sirf lowercase letters aur digits honge
        StringBuilder newStr = new StringBuilder();

        // Original string ke har character par loop chalaya
        for (char i : s.toCharArray()) {

            // Agar character letter ya digit hai tabhi use karenge
            if (Character.isLetterOrDigit(i)) {

                // Character ko lowercase mein convert karke add kiya
                newStr.append(Character.toLowerCase(i));
            }
        }

        int l = 0, r = newStr.length() - 1;  // Left aur Right pointers

        // Jab tak left pointer right se chhota hai
        while (l < r) {

            // Agar dono ends ke characters match nahi karte
            // toh palindrome nahi hai
            if (newStr.charAt(l++) != newStr.charAt(r--)) {
                return false;
            }
        }

        // Agar poora loop without mismatch complete ho gaya
        return true;
    }

    
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(ispalindrome(s));
    }
}