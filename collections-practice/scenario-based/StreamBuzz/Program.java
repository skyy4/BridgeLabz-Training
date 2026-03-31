import java.util.*;

public class Program {

    public static List<CreatorStats> board = new ArrayList<>();

    public void reg(CreatorStats c) {
        board.add(c);
    }

    public Dictionary<String, Integer> top(List<CreatorStats> r, double t) {
        Dictionary<String, Integer> d = new Hashtable<>();

        for (CreatorStats c : r) {
            int k = 0;
            for (double x : c.likes) {
                if (x >= t)
                    k++;
            }
            if (k > 0)
                d.put(c.name, k);
        }
        return d;
    }

    public double avg() {
        double s = 0;
        int n = 0;

        for (CreatorStats c : board) {
            for (double x : c.likes) {
                s += x;
                n++;
            }
        }
        if (n == 0)
            return 0;
        return s / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                CreatorStats c = new CreatorStats();
                System.out.println("Enter Creator Name:");
                c.name = sc.nextLine();

                System.out.println("Enter weekly likes (Week 1 to 4):");
                for (int i = 0; i < 4; i++) {
                    c.likes[i] = sc.nextDouble();
                }
                sc.nextLine();

                p.reg(c);
                System.out.println("Creator registered successfully");
            }

            else if (ch == 2) {
                System.out.println("Enter like threshold:");
                double t = sc.nextDouble();
                sc.nextLine();

                Dictionary<String, Integer> d = p.top(board, t);
                if (d.size() == 0) {
                    System.out.println("No top-performing posts this week");
                } else {
                    Enumeration<String> e = d.keys();
                    while (e.hasMoreElements()) {
                        String k = e.nextElement();
                        System.out.println(k + " - " + d.get(k));
                    }
                }
            }

            else if (ch == 3) {
                System.out.println("Overall average weekly likes: " + (int) p.avg());
            }

            else if (ch == 4) {
                System.out.println("Logging off - Keep Creating with StreamBuzz!");
                break;
            }
        }
        sc.close();
    }
}
