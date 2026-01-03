public class MathUtility {

    static long factorial(int n){
        if(n<0) return -1;
        long res=1;
        for(int i=1;i<=n;i++)
            res*=i;
        return res;
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    static int gcd(int a,int b){
        if(a<0) a=-a;
        if(b<0) b=-b;
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    static int fibonacci(int n){
        if(n<0) return -1;
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args){
        System.out.println("Factorial(5): "+factorial(5));
        System.out.println("Prime(7): "+isPrime(7));
        System.out.println("GCD(20,8): "+gcd(20,8));
        System.out.println("Fibonacci(7): "+fibonacci(7));
        System.out.println("Factorial(-3): "+factorial(-3));
    }
}

