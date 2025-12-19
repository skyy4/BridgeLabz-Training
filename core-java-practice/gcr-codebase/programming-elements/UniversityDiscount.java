
public class UniversityDiscount {

    public static void main(String[] args) {

        double amount = 125000;
        double discountPer = 10;

        double d = (amount * discountPer) / 100;
        double finalFee = amount - d;
  System.out.println("The discount amount is INR " + d + " and the final dicount fee  is INR " + finalFee);
      
    }
}
