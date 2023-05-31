//Write a java program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;

class FindThirdAngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first Angle ");
        int angle1 = sc.nextInt();
        System.out.print("Enter a second angle ");
        int angle2 = sc.nextInt();
        int thirdAngle = 180 - (angle1 + angle2);
        System.out.print("A value of Third Angle is " + thirdAngle);

    }
}