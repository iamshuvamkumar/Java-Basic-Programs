 import java.util.Scanner;  
   class NastedYoungest3{
    public static void main(String[]Rk){
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter A ");
     int a= sc.nextInt();
   System.out.print("Enter B ");
     int b= sc.nextInt();
   System.out.print("Enter C ");
     int c= sc.nextInt();
 if(a<b){
     if(a<c){
     System.out.print("A is Youngest ");
      }
    else{
     System.out.print("C is Youngest ");
     }
   }
   else {
    if(b<c){
     System.out.print("B is Youngest ");
     }
    else{
     System.out.print("C is Youngest ");
     }
   }

  }
}