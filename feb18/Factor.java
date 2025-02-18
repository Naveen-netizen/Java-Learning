package feb18;

public class Factor {
    public static void main(String[] args) {
        int n=40;
        factorOfNum(n);
    }
    static void factorOfNum(int n){
          for (int index = 1; index <= n/2; index++) {
            if(n%index==0){
                System.out.println(index);
            }
          }
          System.out.println(n);
    }
}
