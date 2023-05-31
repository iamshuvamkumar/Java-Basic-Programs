  import java.util.Scanner;
    class NumberInWord{
     public static void main(String[]Rk){
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Value. ");

	long num = sc.nextLong();
    	long rev=0,rev1=0,sum=0;
        int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
    
	while(num!=0){
         rev = num%10;
         sum =(sum*10)+rev; 
         num/=10;
	}
  
	while(sum!=0){
         rev1 = sum%10;
         sum/=10;
		
         if(rev1==0){
	 System.out.print(" ZERO ");
          }
	else if(rev1==1){
	 System.out.print(" ONE ");
        }
	else if(rev1==2){
	 System.out.print(" TWO ");
        }
	else if(rev1==3){
	 System.out.print(" THREE ");
        }
	else if(rev1==4){
	 System.out.print(" FOUR ");
        }
	else if(rev1==5){
	 System.out.print(" FIVE ");
        }
	else if(rev1==6){
	 System.out.print(" SIX ");
        }
	else if(rev1==7){
	 System.out.print(" SEVEN ");
        }
	else if(rev1==8){
	 System.out.print(" EIGHT ");
        }
	else if(rev1==9){
	 System.out.print(" NINE ");
        }

      }
	
  }
}