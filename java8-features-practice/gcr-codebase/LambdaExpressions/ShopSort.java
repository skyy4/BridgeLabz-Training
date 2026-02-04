import java.util.*;

class ShopSort {
    static class P {
        String n;
        double p, r, d;

        P(String n, double p, double r, double d) {
            this.n = n;
            this.p = p;
            this.r = r;
            this.d = d;
        }
    }

    public static void main(String[] a) {
        List<P> l = new ArrayList<>();
        l.add(new P("A", 500, 4.5, 10));
        l.add(new P("B", 300, 4.8, 20));
        l.sort((x, y) -> Double.compare(x.p, y.p));
        l.forEach(x -> System.out.println(x.n));
    }
}
