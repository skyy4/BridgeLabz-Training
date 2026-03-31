public class SelectionSortScores {

    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] score = { 88, 55, 92, 70 };
        sort(score);
        for (int x : score)
            System.out.print(x + " ");
    }
}
