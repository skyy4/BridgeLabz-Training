public class RemoveDuplicateSB {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found)
                sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
