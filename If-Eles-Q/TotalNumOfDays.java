//Write a java program print total number of days in a month
 
import java.util.Scanner;
 
class TotalNumOfDays{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Month Num");
int x = sc.nextInt();


      
if((x==1)){
System.out.print("31");
}
else if((x==2)){
System.out.print("28/29");
}
else if((x==3)){
System.out.print("30");
}
else if((x==4)){
System.out.print("31");
}
else if((x==5)){
System.out.print("30");
}
else if((x==6)){
System.out.print("31");
}
else if((x==7)){
System.out.print("30");
}
else if((x==8)){
System.out.print("31");
}
else if((x==9)){
System.out.print("30");
}
else if((x==10)){
System.out.print("31");
}
else if((x==11)){
System.out.print("30");
}
else if((x==12)){
System.out.print("31");
}
else{
System.out.print("Enter A valid month number");
}


}
}