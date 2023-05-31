//Write a Java program to enter radius of a circle and find its diameter, circumference and area.

import java.util.Scanner;

class CirDimtrAndArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Radius ");
        float radius = sc.nextFloat();

        float diameter = 0.0f, circumference = 0.0f, area = 0.0f, pi = 3.14f;

        diameter = 2.0f * radius;
        circumference = 2.0f * pi * radius;
        area = pi * radius * radius;

        System.out.println("A vlaue of Diameter is " + diameter);

        System.out.println("A value of Circumference is " + circumference);

        System.out.println("A value of Area is " + area);

    }
}
