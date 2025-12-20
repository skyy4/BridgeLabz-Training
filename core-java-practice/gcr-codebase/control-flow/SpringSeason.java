public class SpringSeason {

    public static void main(String[] args) {

        int mon = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        // Check if the date falls within Spring season range
        if ((mon == 3 && day >= 20) ||
            (mon == 4) ||
            (mon == 5) ||
            (mon == 6 && day <= 20)) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}