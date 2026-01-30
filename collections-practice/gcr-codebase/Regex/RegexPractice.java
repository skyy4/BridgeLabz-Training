import java.util.regex.*;

public class RegexPractice {

    public static void main(String[] args) {

        // 1. Validate Username
        System.out.println("Username valid: " +
                "user_123".matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));

        // 2. Validate License Plate
        System.out.println("License valid: " +
                "AB1234".matches("^[A-Z]{2}[0-9]{4}$"));

        // 3. Validate Hex Color
        System.out.println("Hex valid: " +
                "#FFA500".matches("^#[0-9a-fA-F]{6}$"));

        // 4. Extract Emails
        String emailText =
                "Contact us at support@example.com and info@company.org";
        extract(emailText,
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}",
                "Emails");

        // 5. Extract Capitalized Words
        String capText =
                "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extract(capText,
                "\\b[A-Z][a-z]*\\b",
                "Capitalized Words");

        // 6. Extract Dates
        String dateText =
                "Dates are 12/05/2023, 15/08/2024 and 29/02/2020";
        extract(dateText,
                "\\b\\d{2}/\\d{2}/\\d{4}\\b",
                "Dates");

        // 7. Extract Links
        String linkText =
                "Visit https://www.google.com and http://example.org";
        extract(linkText,
                "https?://\\S+",
                "Links");

        // 8. Replace Multiple Spaces
        String spaced = "This   is   an    example";
        System.out.println("Single space: " +
                spaced.replaceAll("\\s+", " "));

        // 9. Censor Bad Words
        String bad =
                "This is a damn bad example with stupid words";
        System.out.println("Censored: " +
                bad.replaceAll("(?i)damn|stupid", "****"));

        // 10. Validate IP Address
        System.out.println("IP valid: " +
                "192.168.1.1".matches(
                        "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}" +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$"));

        // 11. Credit Card Validation
        System.out.println("Visa valid: " +
                "4123456789012345".matches("^4\\d{15}$"));

        // 12. Extract Programming Languages
        String langText =
                "I love Java, Python, JavaScript and Go";
        extract(langText,
                "JavaScript|Java|Python|Go",
                "Languages");

        // 13. Extract Currency
        String moneyText =
                "The price is $45.99 and discount is 10.50";
        extract(moneyText,
                "\\$?\\d+\\.\\d{2}",
                "Currency");

        // 14. Repeating Words
        String repeat =
                "This is is a repeated repeated word";
        extract(repeat,
                "\\b(\\w+)\\b\\s+\\1\\b",
                "Repeating Words");

        // 15. Validate SSN
        System.out.println("SSN valid: " +
                "123-45-6789".matches("\\b\\d{3}-\\d{2}-\\d{4}\\b"));
    }

    static void extract(String text, String regex, String title) {
        System.out.println("\n" + title + ":");
        Matcher m = Pattern.compile(regex).matcher(text);
        while (m.find())
            System.out.println(m.group());
    }
}
