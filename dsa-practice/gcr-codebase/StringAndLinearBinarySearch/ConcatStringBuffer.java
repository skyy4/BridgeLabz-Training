public class ConcatStringBuffer {
    public static void main(String[] args) {
        String[] arr = { "Java", " ", "is", " ", "fast" };
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);

        System.out.println(sb.toString());
    }
}
