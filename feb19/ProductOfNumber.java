package feb19;

public class ProductOfNumber {
    public static void main(String[] args) {
        System.out.println(prod(1234));
    }
    public static int prod(int n){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        n=n/10;
        return rem*prod(n);
    }
}
