package feb19.Recursion;

public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        int counter=1;
        for (int i = n; i > 1; i--) {
            counter=counter*i;
        }
        return counter;
    }
}
