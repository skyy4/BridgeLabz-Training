public class CompareSB {
    public static void main(String[] args) {
        int n = 100000;

        long t1 = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb1.append("a");
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < n; i++)
            sb2.append("a");
        long t4 = System.nanoTime();

        System.out.println("StringBuilder: " + (t2 - t1));
        System.out.println("StringBuffer : " + (t4 - t3));
    }
}
