import java.util.Scanner; 
class nCr{
 
 
    static int nCr(int x, int y)
    {
         return fact(x)/(fact(y)*fact(x-y));
    }
   static  int fact(int  x){
     if(x==0)
      return 1;
         int  s= 1;
         for(int  i=1;i<=x;i++){
         s=s*i;
        }
     return s;
   } 
    
 

   public static void main(String[]args){
  
   Scanner sc = new Scanner(System.in);
   int  a= sc.nextInt();
   int  b= sc.nextInt();
    
 
 System.out.println(nCr(a,b));
 
 }
 }