package pack1;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = S.nextInt();
        double area = PI * r * r;
        System.out.println("The area is " + area);
        System.out.println("The square root is: " + sqrt(5));
        S.close();
    }
}
