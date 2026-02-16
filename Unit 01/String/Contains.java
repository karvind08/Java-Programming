public class Contains {
    public static void main(String[] args) {
        String str = "Follow me on Linkedin";
        System.out.println(str.contains("on Linkedin")); // true
        System.out.println(str.contains("Follow")); // true
        System.out.println(str.contains("follow")); // false

    }
}
