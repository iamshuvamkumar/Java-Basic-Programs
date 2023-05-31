// Write a Java program to enter temperature in Fahrenheitand convert it into Celsius.

import java.util.Scanner;

 class TemConvertFahrAndCels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Fahrenheitand  value to Convert into Celsius ");
        float Fahrenheitand = sc.nextFloat();
        double celsius = (Fahrenheitand - 32) * 5.0F / 9.0F;
        System.out.print("Fahr into Cel " + celsius);
    }
}