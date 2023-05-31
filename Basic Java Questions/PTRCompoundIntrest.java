//Write a java program to print day of week name using if else.

import java.util.Scanner;
class WeekName{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int day = sc.nextInt();

if(day==1){
System.out.print("Monday");
}
else if(day==2){
System.out.print("Tuesday");
}
else if(day==3){
System.out.print("Wenesday");
}
else if(day==4){
System.out.print("Thrusday");
}

else if(day==5){
System.out.print("Friday");
}
else if(day==6){
System.out.print("Staurday");
}
else if(day==7){
System.out.print("Sunday");
}

}
}