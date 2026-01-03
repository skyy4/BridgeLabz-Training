public class EduQuiz {

    static int calculateScore(String[] correct,String[] student){
        int score=0;
        for(int i=0;i<correct.length;i++){
            if(student[i].equalsIgnoreCase(correct[i])){
                score++;
                System.out.println("Question "+(i+1)+": Correct");
            }else{
                System.out.println("Question "+(i+1)+": Incorrect");
            }
        }
        return score;
    }

    public static void main(String[] args){
        String[] correct={
            "A","B","C","D","A","B","C","D","A","B"
        };

        String[] student={
            "A","b","C","a","A","B","d","D","A","c"
        };

        int score=calculateScore(correct,student);
        double percent=(score/10.0)*100;

        System.out.println("Score: "+score+"/10");
        System.out.println("Percentage: "+percent+"%");

        if(percent>=50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

