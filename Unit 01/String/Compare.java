public class Compare {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = "Programming Java";

        int result1 = str1.compareTo(str2);
        System.out.println(result1); // 0

        int result2 = str1.compareTo(str3);
        System.out.println(result2); // -6

        int result3 = str3.compareTo(str1);
        System.out.println(result3); // 6
    }
}
