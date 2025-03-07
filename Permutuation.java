public class Permutuation {
    public static void main(String[] args) {
        String name = "abc";
        permutuation("", name);
    }

    public static void permutuation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutuation(f + ch + s, up.substring(1, up.length()));
        }
    }
}
