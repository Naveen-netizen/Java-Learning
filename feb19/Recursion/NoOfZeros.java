package feb19.Recursion;

public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(0, 0));
    }

    static int count(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            c = c + 1;
        }
        n = n / 10;
        return count(n, c);
    }
}
