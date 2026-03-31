import java.util.Stack;
import java.util.HashMap;

public class ExamProctor {

    Stack<Integer> nav = new Stack<>();
    HashMap<Integer, String> ans = new HashMap<>();

    void visitQuestion(int qid) {
        nav.push(qid);
    }

    void submitAnswer(int qid, String answer) {
        ans.put(qid, answer);
    }

    int calculateScore(HashMap<Integer, String> correct) {
        int score = 0;
        for (int q : correct.keySet()) {
            if (ans.containsKey(q) &&
                    ans.get(q).equalsIgnoreCase(correct.get(q)))
                score++;
        }
        return score;
    }

    public static void main(String[] args) {
        ExamProctor e = new ExamProctor();

        e.visitQuestion(1);
        e.submitAnswer(1, "A");

        e.visitQuestion(2);
        e.submitAnswer(2, "C");

        HashMap<Integer, String> correct = new HashMap<>();
        correct.put(1, "A");
        correct.put(2, "B");

        System.out.println("Score: " + e.calculateScore(correct));
    }
}
