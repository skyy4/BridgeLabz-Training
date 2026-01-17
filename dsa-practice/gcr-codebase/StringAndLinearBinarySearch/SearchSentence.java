public class SearchSentence {
    public static void main(String[] args) {
        String[] s = {
                "Java is powerful",
                "Python is easy",
                "I love coding"
        };
        String key = "python";
        String res = "Not Found";

        for (int i = 0; i < s.length; i++) {
            if (s[i].toLowerCase().contains(key)) {
                res = s[i];
                break;
            }
        }
        System.out.println(res);
    }
}
