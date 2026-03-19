import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int r = S.nextInt();
        String name = switch(r){
            case 1:
                yield "Arvind";
            case 2:
                yield "Yuvaan";
            default:
                yield "Jiya";
        };
        System.out.println(name);
        S.close();
    }
}