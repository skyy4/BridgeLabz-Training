package util;

public class InputValidator {

    // Regex for company name
    public static boolean isValidCompanyName(String name) {
        return name.matches("^[A-Za-z]{3,}$");
    }
}
