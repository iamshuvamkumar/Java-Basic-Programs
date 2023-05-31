  import java.util.Scanner;
    class FrequencyDigit{
     public static void main(String[]Rk){
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Value. ");

	long num = sc.nextLong();
    	long rev=0;
        int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
    
	while(num!=0){
         rev = num%10;
         num/=10;

         if(rev==0){
	c0++;
          }
	else if(rev==1){
	c1++;
        }
	else if(rev==2){
	c2++;
        }
	else if(rev==3){
	c3++;
        }
	else if(rev==4){
	c4++;
        }
	else if(rev==5){
	c5++;
        }
	else if(rev==6){
	c6++;
        }
	else if(rev==7){
	c7++;
        }
	else if(rev==8){
	c8++;
        }
	else if(rev==9){
	c9++;
        }
      }

      System.out.println("0 ->"+c0);
      System.out.println("1 ->"+c1);
      System.out.println("2 ->"+c2);
      System.out.println("3 ->"+c3);
      System.out.println("4 ->"+c4);
      System.out.println("5 ->"+c5);
      System.out.println("6 ->"+c6);
      System.out.println("7 ->"+c7);
      System.out.println("8 ->"+c8);
      System.out.println("9 ->"+c9);


  }
}