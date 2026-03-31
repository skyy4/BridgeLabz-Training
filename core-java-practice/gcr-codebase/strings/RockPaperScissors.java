import java.util.Scanner;

public class RockPaperScissors {

    // Generate computer choice using Math.random()
    public static String compChoice() {

        int r = (int) (Math.random() * 3);

        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    // Find winner between user and computer
    public static String findWinner(String user, String comp) {

        if (user.equals(comp)) {
            return "Draw";
        }

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    // Calculate total wins and winning percentage
    public static String[][] calcStats(int uWin, int cWin, int games) {

        String[][] stats = new String[2][3];

        double uPer = (uWin * 100.0) / games;
        double cPer = (cWin * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(uWin);
        stats[0][2] = String.valueOf(uPer);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(cWin);
        stats[1][2] = String.valueOf(cPer);

        return stats;
    }

    // Display game-wise result and final statistics
    public static void show(String[][] games, String[][] stats) {

        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                games[i][0] + "\t" +
                games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        String[][] res = new String[games][3];

        int uWin = 0;
        int cWin = 0;

        for (int i = 0; i < games; i++) {

            String user = sc.next();
            String comp = compChoice();
            String win = findWinner(user, comp);

            res[i][0] = user;
            res[i][1] = comp;
            res[i][2] = win;

            if (win.equals("User")) uWin++;
            else if (win.equals("Computer")) cWin++;
        }

        String[][] stats = calcStats(uWin, cWin, games);

        show(res, stats);

        sc.close();
    }
}