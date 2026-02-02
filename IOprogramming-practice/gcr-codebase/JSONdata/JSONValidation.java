import com.fasterxml.jackson.databind.*;

public class JSONValidation {
    public static void main(String[] a) {
        try {
            new ObjectMapper().readTree("{\"a\":1}");
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}
