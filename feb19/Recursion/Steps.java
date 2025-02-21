package feb19.Recursion;

public class Steps {
    public static void main(String[] args) {
        int a=14;
        System.out.println(stepsToZero(a, 0));
    }

    static int stepsToZero(int n,int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return stepsToZero(n/2, s+1);
        }
        return stepsToZero(n-1, s+1);

    }
}
