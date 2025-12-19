public class Palindromenumber {

    public static boolean isPalindrome(int x) {

        // Agar number negative hai ya 0 ke alawa 0 se end hota hai,
        // toh palindrome nahi ho sakta
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;  // Number ka second half reverse karne ke liye

        // Jab tak original number ka half, reversed half se bada hai
        while (x > revertedNumber) {

            // Last digit nikalkar reversedNumber mein add ki
            revertedNumber = revertedNumber * 10 + x % 10;

            // Original number se last digit hata di
            x /= 10;
        }

        // Even digits: x == revertedNumber
        // Odd digits: x == revertedNumber / 10 (middle digit ignore)
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        int x = 12321;   // test input
        System.out.println(isPalindrome(x));
    }
}