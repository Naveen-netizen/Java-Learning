package mar07;
public class PermutuationCount {
    public static void main(String[] args) {
         String in="abcdefghijkl";
         int count=count("", in);
         System.out.println("The number of permutuations of the string is"+" "+count);
    }

    public static int count(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int counter = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            counter = counter + count(f + ch + s, up.substring(1, up.length()));
        }
        return counter;
    }
}
