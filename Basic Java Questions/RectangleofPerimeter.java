//Write a Java program to enter length and breadth of a rectangle and find its perimeter.

import java.util.Scanner;

class RectangleOfPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length rectangle ");
        int length = sc.nextInt();
        System.out.print("Enter a breadth rectangle ");
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.print("Rectangel perimeter is " + perimeter);
    }
}
