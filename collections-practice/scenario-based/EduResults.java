public class EduResults {

    static void mergeSort(int[] a,int l,int r){
        if(l>=r) return;

        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
    }

    static void merge(int[] a,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0;

        while(i<=m && j<=r){
            if(a[i]<=a[j]) // stable
                t[k++]=a[i++];
            else
                t[k++]=a[j++];
        }

        while(i<=m) t[k++]=a[i++];
        while(j<=r) t[k++]=a[j++];

        for(int x=0;x<t.length;x++)
            a[l+x]=t[x];
    }

    public static void main(String[] args){
        int[] d1={90,85,80};
        int[] d2={95,88,70};
        int[] d3={92,85,75};

        int[] all=new int[d1.length+d2.length+d3.length];
        int k=0;

        for(int x:d1) all[k++]=x;
        for(int x:d2) all[k++]=x;
        for(int x:d3) all[k++]=x;

        mergeSort(all,0,all.length-1);

        for(int i=all.length-1;i>=0;i--)
            System.out.print(all[i]+" ");
    }
}
