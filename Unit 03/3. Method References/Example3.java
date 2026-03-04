import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        String[] str = { "duggu", "advika", "Arvind", "Yuvaan", "jiya" };
        Arrays.sort(str, String::compareToIgnoreCase);
        for (String s : str) {
            System.out.println(s);
        }
    }
}