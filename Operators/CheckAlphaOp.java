
import java.util.Scanner;

 class CheckAlphaOp{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
  
}
}