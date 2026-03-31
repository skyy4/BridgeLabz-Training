// package scenario_based;

import java.util.ArrayList;
import java.util.List;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

public class CinemaTime {

    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    public void addMovie(String title, String time)
            throws InvalidTimeFormatException {

        if (!isValidTime(time))
            throw new InvalidTimeFormatException("Invalid time format: " + time);

        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                        String.format("Movie: %s | Time: %s",
                                titles.get(i), times.get(i)));
                found = true;
            }
        }

        if (!found)
            System.out.println("No matching movie found");
    }

    public void displayAllMovies() {
        try {
            for (int i = 0; i < titles.size(); i++) {
                System.out.println(
                        String.format("%d. %s at %s",
                                i + 1, titles.get(i), times.get(i)));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index access");
        }
    }

    public void printReport() {
        String[] movieArr = titles.toArray(new String[0]);
        String[] timeArr = times.toArray(new String[0]);

        System.out.println("---- Movie Report ----");
        for (int i = 0; i < movieArr.length; i++) {
            System.out.println(movieArr[i] + " -> " + timeArr[i]);
        }
    }

    private boolean isValidTime(String t) {
        try {
            String[] p = t.split(":");
            if (p.length != 2)
                return false;

            int h = Integer.parseInt(p[0]);
            int m = Integer.parseInt(p[1]);

            return h >= 0 && h <= 23 && m >= 0 && m <= 59;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        CinemaTime c = new CinemaTime();

        try {
            c.addMovie("Inception", "18:30");
            c.addMovie("Avatar", "21:15");
            c.addMovie("Joker", "25:99"); // exception
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        c.displayAllMovies();
        c.searchMovie("ava");
        c.printReport();
    }
}
