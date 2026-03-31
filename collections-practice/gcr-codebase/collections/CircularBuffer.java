package collections;

public class CircularBuffer {

    int[] a;
    int f=0,c=0,n;

    CircularBuffer(int n){
        this.n=n;
        a=new int[n];
    }

    void add(int x){
        a[(f+c)%n]=x;
        if(c<n) c++;
        else f=(f+1)%n;
    }

    void show(){
        for(int i=0;i<c;i++)
            System.out.print(a[(f+i)%n]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        CircularBuffer b=new CircularBuffer(3);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.show();
    }
}