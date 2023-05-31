import java.util.Scanner;

class DataType {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Integer value ");
        int integer = sc.nextInt();
        System.out.println("A Integer value is " + integer);

        System.out.print("Enter a Short value ");
        short shot = sc.nextShort();
        System.out.println("A Short value is " + shot);

        System.out.print("Enter a Byte value ");
        byte bty = sc.nextByte();
        System.out.println("A Byte value is " + bty);

        System.out.print("Enter a Long value ");
        long large = sc.nextLong();
        System.out.println("A Long value is " + large);

        System.out.print("Enter a Double value ");
        double doble = sc.nextDouble();
        System.out.println("A Double value is " + doble);

        System.out.print("Enter a Float value ");
        float flot = sc.nextFloat();
        System.out.println("A Float vlaue is " + flot);

        System.out.print("Enter a Charecter ");
        char ch = sc.next().charAt(0);
        System.out.println("A Charecter is " + ch);

        System.out.println("A Boolean True & False ");
        boolean bolen = sc.nextBoolean();
        System.out.println("A Boolean is " + bolen);

    }
}