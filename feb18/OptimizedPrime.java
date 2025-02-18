package feb18;

public class OptimizedPrime {
    public static void main(String[] args) {
        int num=25;
        boolean ans=isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
