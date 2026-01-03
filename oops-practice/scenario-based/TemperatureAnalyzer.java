public class TemperatureAnalyzer {

    public static void analyze(float[][] temp){
        float maxDayAvg=-1000,minDayAvg=1000;
        int hotDay=0,coldDay=0;

        for(int d=0;d<7;d++){
            float sum=0;
            for(int h=0;h<24;h++){
                sum+=temp[d][h];
            }
            float avg=sum/24;
            System.out.println("Day "+(d+1)+" Average: "+avg);

            if(avg>maxDayAvg){
                maxDayAvg=avg;
                hotDay=d+1;
            }
            if(avg<minDayAvg){
                minDayAvg=avg;
                coldDay=d+1;
            }
        }

        System.out.println("Hottest Day: Day "+hotDay);
        System.out.println("Coldest Day: Day "+coldDay);
    }

    public static void main(String[] args){
        float[][] temp=new float[7][24];

        for(int i=0;i<7;i++){
            for(int j=0;j<24;j++){
                temp[i][j]=20+(float)Math.random()*15;
            }
        }

        analyze(temp);
    }
}