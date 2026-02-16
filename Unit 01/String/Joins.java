public class Joins {
    public static void main(String[] args) {
        String strJoin = String.join(" ", "Have", "a", "Nice", "day");
        System.out.println(strJoin);

        String str1Join = String.join("-", "Have", "a", "Nice", "day");
        System.out.println(str1Join);

        String str2Join = String.join("/", "19", "02", "2026");
        System.out.println(str2Join);

        String str3Join = String.join("::", "12", "18", "55");
        System.out.println(str3Join);
    }
}
