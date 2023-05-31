import java.util.Scanner;

public class Arthmaticop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x ");
        int x = sc.nextInt();
        System.out.print("Enter a value of y ");
        int y = sc.nextInt();
        System.out.println("A sum of x and y is " +(x + y));
        System.out.println("A sub of x and y is " +(x - y));
        System.out.println("A mul of x and y is " +(x * y));
        System.out.println("A div of x and y is " +(x / y));
        System.out.println("A mud of x and y is " +(x % y));
    }
}
