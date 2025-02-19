package feb19;

public class nto1 {
    public static void main(String[] args) {
     func(5);   
    }
    static void func(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        func(--n);//pre-decrement is essential. Post decrement will lead to infinite recurssion.
    }
}
