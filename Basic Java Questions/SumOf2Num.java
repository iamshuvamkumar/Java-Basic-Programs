import java.util.Scanner;

 class Sumof2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of X ");
        int x = sc.nextInt();
        System.out.print("Enter a value of Y ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Sum of 2 Num is = " + z);
    }
}
