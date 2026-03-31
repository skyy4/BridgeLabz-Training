public class CountingSortAges {

    static void sort(int[] a) {
        int[] count = new int[19];

        for (int x : a)
            count[x]++;

        int k = 0;
        for (int i = 10; i <= 18; i++) {
            while (count[i]-- > 0)
                a[k++] = i;
        }
    }

    public static void main(String[] args) {
        int[] age = { 12, 15, 11, 18, 10, 14 };
        sort(age);
        for (int x : age)
            System.out.print(x + " ");
    }
}
