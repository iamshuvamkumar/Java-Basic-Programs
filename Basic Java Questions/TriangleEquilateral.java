//Write a java program to calculate area of an equilateral triangle.

import java.util.Scanner;

class TriangleEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a area of equilater trinagle ");
        float a = sc.nextFloat();
        float equilateral = (a * a) / (4.0F) * (1.73F);
        System.out.print("A area of Equilateral Triangle => " + equilateral);
    }
}
