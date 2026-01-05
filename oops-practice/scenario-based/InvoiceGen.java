public class InvoiceGen {

    // Split invoice string
    public static String[] parse(String s) {
        if (!s.contains("-")) {
            throw new IllegalArgumentException("Invalid invoice format");
        }
        return s.split(",");
    }

    // Calculate total amount
    public static int tot(String[] arr) {

        int sum = 0;

        for (String t : arr) {
            String[] p = t.split("-");
            if (p.length < 2) {
                throw new IllegalArgumentException("Missing amount");
            }

            String[] amt = p[1].trim().split(" ");
            sum += Integer.parseInt(amt[0]);
        }

        return sum;
    }

    public static void main(String[] args) {

        String inp = "Logo Design - 3000 INR, Web Page - 4500 INR";

        try {
            String[] t = parse(inp);
            System.out.println("Total Amount = " + tot(t));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

