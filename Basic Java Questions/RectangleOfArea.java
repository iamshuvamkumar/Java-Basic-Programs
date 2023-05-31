//Write a Java program to enter length and breadth of a rectangle and find its area.

import java.util.Scanner;

class RectangleOfArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.print("Area of rectangle is " + area);
    }
}