

import java.util.Scanner;
  class CalculateAverage{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter 1st value. ");
  float a = (float) sc.nextFloat();

  System.out.print("Enter 2nd value. ");
  float b = (float) sc.nextFloat();

  System.out.print("Enter 3rd value. ");
  float c = (float) sc.nextFloat();

  System.out.print("Enter 4th value. ");
  float d = (float) sc.nextFloat();

  System.out.print("Enter 5th value. ");
  float e = (float) sc.nextFloat();

  System.out.format("Avg of Three num is. "+"%.2f",(a+b+c+d+e)/5.0f);

}
}