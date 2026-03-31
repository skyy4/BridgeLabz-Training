import java.util.Scanner;

public class DeckOfCards {

    // Initialize deck of cards
    public static String[] initDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        int n = suits.length * ranks.length;
        String[] deck = new String[n];

        int idx = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[idx] = ranks[j] + " of " + suits[i];
                idx++;
            }
        }

        return deck;
    }

    // Shuffle the deck using Fisher–Yates logic
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int r = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        return deck;
    }

    // Distribute cards to players
    public static String[][] distribute(String[] deck, int players, int cards) {

        if (players * cards > deck.length) {
            return null;
        }

        String[][] res = new String[players][cards];
        int idx = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                res[i][j] = deck[idx];
                idx++;
            }
        }

        return res;
    }

    // Display players and their cards
    public static void show(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("Player " + (i + 1) + ":");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt(); // number of players
        int cards = sc.nextInt();   // cards per player

        String[] deck = initDeck();
        deck = shuffleDeck(deck);

        String[][] res = distribute(deck, players, cards);

        if (res == null) {
            System.out.println("Cards cannot be distributed evenly");
        } else {
            show(res);
        }

        sc.close();
    }
}