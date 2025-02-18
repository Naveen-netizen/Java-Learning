package feb18;

public class Newtonsqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(40));
    }
    static double sqrt(int n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}
