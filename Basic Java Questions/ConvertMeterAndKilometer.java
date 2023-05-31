//Write a java program to enter length in centimeter and convert it into meter and kilometer.

import java.util.Scanner;

class convertMeterAndKilometer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length");
        float length = sc.nextFloat();
        float meter = length / 100.0f;
        float kilometer =  length / 100000.0f;
        System.out.println("Length convert into meter " + meter);
        System.out.print("Length convert into kilometer " + kilometer);
    }
}