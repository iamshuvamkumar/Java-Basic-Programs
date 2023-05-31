// Write a Java program to enter temperature in Celsius and convert it into Fahrenheit

import java.util.Scanner;

class TemConvertCelAndFahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Celsius value to convert into Fahrenheit ");
        float celsius = sc.nextFloat();
        double Fahrenheit = celsius * (9.0F / 5.0F) + 32.0F;
        System.out.println(" Cel into Fahr " + Fahrenheit);

    }
}