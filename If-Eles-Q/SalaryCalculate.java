
import java.util.Scanner;

 class SalaryCalculate{

  public static void main(String[]args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Basic Salary. ");
   float x = (float) sc.nextFloat();
   float da = 0.0f;
   float hra = 0.0f;
   float pf = 0.0f;
   
   
    if(x<= 10000){
     da = x*0.8f;
     hra = x*0.2f;
    }
     else if( x<=20000){
     da = x*0.9f;
     hra = x*0.25f;
    }
   else if( x>20000) {
    da = x*0.95f;
    hra = x*0.3f;
   }

  double gross = x + da+hra;
  System.out.format("A gross salary is "+"%.2f",gross);

  if(gross>=20000){
     pf = (float)gross*0.8f;
  }
 else if(gross>=30000){
     pf = (float)gross*0.12f;
  }
 else if(gross>=50000){
     pf = (float)gross*0.15f;
  }
 else if(gross>=70000){
     pf = (float)gross*0.25f;
  }

 double  netsaly = gross-pf;

System.out.format("\nA net Salary "+"%.2f",netsaly);



}
}
    