package feb19.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        return a*factorial(a-1);
    }
}
