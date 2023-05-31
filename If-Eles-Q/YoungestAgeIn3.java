import java.util.Scanner;  

 class YoungestAgeIn3{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Age  A. ");
    int a = sc.nextInt();
     System.out.print("Enter Age  B. ");
    int b = sc.nextInt();
     System.out.print("Enter Age  C. ");
    int c = sc.nextInt();

   if(a<b&&a<c)
         System.out.print("A is Chota ");
   else if(b<c)
        System.out.print("B is Chota ");
   else
       System.out.print("C is Chota");
   }
}

