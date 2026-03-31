public class BubbleSortMarks {

    static void sort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args){
        int[] marks={45,78,12,90,66};
        sort(marks);
        for(int x:marks)
            System.out.print(x+" ");
    }
}
