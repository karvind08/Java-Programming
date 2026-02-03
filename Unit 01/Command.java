public class Command {
    public static void main(String[] args) {
        int count = args.length;
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(args[i]);
        }
    }
}
