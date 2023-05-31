//Write a java program to enter base and height of triangle and find its area.

import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base :");
        int base = sc.nextInt();
        System.out.print("Enter Height :");
        int height = sc.nextInt();
        int area = (base * height) * 1 / 2;
        System.out.print("A area of triangle is :- " + area);
    }
}
