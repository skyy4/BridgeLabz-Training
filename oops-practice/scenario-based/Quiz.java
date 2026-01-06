import java.util.ArrayList;

public class Quiz {

    // Compare answers
    public static int score(String[] cor, String[] usr) {

        if (cor.length != usr.length) {
            throw new IllegalArgumentException("Answer length mismatch");
        }

        int sc = 0;
        for (int i = 0; i < cor.length; i++) {
            if (cor[i].equals(usr[i])) {
                sc++;
            }
        }
        return sc;
    }

    // Grade result
    public static String grd(int sc) {
        if (sc >= 4) return "A";
        if (sc >= 2) return "B";
        return "C";
    }

    public static void main(String[] args) {

        String[] cor = {"A","B","C","D","A"};
        String[] usr = {"A","B","D","D","A"};

        ArrayList<Integer> res = new ArrayList<>();

        int sc = score(cor, usr);
        res.add(sc);

        System.out.println("Score = " + sc);
        System.out.println("Grade = " + grd(sc));
    }
}

