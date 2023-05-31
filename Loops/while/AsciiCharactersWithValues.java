import java.util.Scanner;

 class AsciiCharactersWithValues{
   public static void main(String[]Rk){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Starting Num. ");
    int Snum = sc.nextInt();
   System.out.println("Enter Ending Num. ");
    int Enum = sc.nextInt();
     System.out.println("NO."+" "+"ASCII Value");
    while(Snum<=Enum){
   System.out.println(Snum+"  ->  "+((char)Snum));
   Snum++; 
    }
 
 }
}