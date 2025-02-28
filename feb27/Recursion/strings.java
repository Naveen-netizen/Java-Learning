public class strings {
    public static void main(String[] args) {
        String in = "abccd";
        skip("", in);
    }

    static void skip(String a, String b) {
       
        if (b.length()==0) {
            System.out.println(a);
            return;
        }

        char ans = b.charAt(0);

        if (ans == 'a') {
            skip(a, b.substring(1));
        } else {
            skip(a + ans, b.substring(1));
        }
    }
}
