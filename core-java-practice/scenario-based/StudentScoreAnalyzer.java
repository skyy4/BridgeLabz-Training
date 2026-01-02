import java.util.*;

public class StudentScoreAnalyzer {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Invalid student count");
            return;
        }

        int[] marks=new int[n];
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            System.out.print("Enter score for student "+(i+1)+": ");
            if(!sc.hasNextInt()){
                System.out.println("Invalid input");
                return;
            }

            int m=sc.nextInt();
            if(m<0){
                System.out.println("Negative scores not allowed");
                return;
            }

            marks[i]=m;
            sum+=m;

            if(m>max) max=m;
            if(m<min) min=m;
        }

        double avg=(double)sum/n;
        System.out.println("Average Score: "+avg);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);

        System.out.println("Scores above average:");
        for(int m:marks){
            if(m>avg)
                System.out.println(m);
        }
    }
}