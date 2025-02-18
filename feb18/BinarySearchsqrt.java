package feb18;

public class BinarySearchsqrt {
    public static void main(String[] args) {
        int num=40;
        int p=3;
        System.out.printf("%.3f",sqrt(num,p));
    }
    static double sqrt(int n, int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
                root=mid;
            }
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<n){
                root+=incr;
            }
            root-=incr;
            incr=0.1/10;
        }
        return root;
    }
}
