package feb18;

public class LCM {
    public static void main(String[] args) {
      int a=12;
      int b=24;
      System.out.println(lcm(a, b));  
    }
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a, b);
    }
}
