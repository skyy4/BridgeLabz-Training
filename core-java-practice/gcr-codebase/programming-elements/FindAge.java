
public class FindAge {
    public static int calculate(int by, int cy) {
        return cy - by;
    }

    public static void main(String[] args) {
        int by = 2000;
        int cy = 2024;
        int age = calculate(by, cy);
        System.out.println("Harry's age in 2024 is " + age);
    }
    
}
