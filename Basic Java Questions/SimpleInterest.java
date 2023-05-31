//Write a java program to enter P, T, R and calculate Simple Interest.

import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount ");
        float P = sc.nextFloat();
        System.out.print("Enter Rate ");
        float T = sc.nextFloat();
        System.out.print("Enter Time ");
        float R = sc.nextFloat();

        float SInterest = (P * T * R) / 100.0f;
        System.out.print(" A  Interest Is. " + SInterest);
    }
}
