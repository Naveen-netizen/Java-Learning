public class Pattern {
    public static void main(String[] args) {
        pattern(5, 0);
    }

    static void pattern(int n, int s) {
        if (n == 0) {
            return;
        }
        if(n>s){
            System.out.print("* ");
            pattern(n, s+1);
        }
        else{
            System.out.println();
            pattern(n-1, 0);
        }

    }
}
