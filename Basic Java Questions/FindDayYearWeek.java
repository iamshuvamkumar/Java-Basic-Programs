//Write a Java program to convert days into years, weeks and days.


import java.util.Scanner;

class FindDayYearWeek{
 
  public static void main(String[]args){
Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number of Days ");
      int num = sc.nextInt();
       int Years = 0,Weeks = 0,Days = 0;
        Years = num/365;
         Weeks = (num%365)/7;
        Days = num-((Years*365)+(Weeks*7));
System.out.println("Year "+Years+" \nWeeks "+Weeks+" \nDays "+Days);
}
}