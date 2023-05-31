 
class ForLoopAllQ{

  void num1ToN(int a) {
    for (int i = 1; i <= a; i++) {
      System.out.print(" " + i);
    }
  }

  void revNTo1(int a) {
    int tem = a;
    for (int i = 1; i <= a; i++) {
      System.out.print(" " + tem);
      tem--;
    }
    System.out.println();
  }

  void alphabetAToZ(int a) {
    int b = 65;
    for (int i = 1; i <= a; i++) {
      System.out.print(" " + (char) b);
      b++;
    }
    System.out.println();
  }

  void revAlphabetZToA(int a) {
    int b = 90;
    for (int i = 1; i <= a; i++) {
      System.out.print(" " + (char) b);
      b--;
    }
    System.out.println();
  }

  void oddNumber(int a, int b) {
    System.out.print("Odd Num ->");
    for (int i = 1; i <= b; i++) {
      if (a % 2 == 1)
        System.out.print(" " + i);
      a++;
    }
    System.out.println();
  }

  void evenNumber(int a, int b) {
    System.out.print("Even Num ->");
    for (int i = 1; i <= b; i++) {
      if (a % 2 == 0)
        System.out.print(" " + i);
      a++;
    }
    System.out.println();
  }

  void table(int a, int b) {

    for (int i = 1; i <= b; i++) {
      int tem = 0;
      for (int j = 1; j <= 10; j++) {
        tem = i * j;
        System.out.print(" " + tem);
      }
      System.out.println();
    }
    System.out.println();
  }

  void countNumDigit(int x) {
    int r = 0, c = 0;
    for (int i = 1; x != 0; i++) {
      r = x % 10;
      c++;
      x /= 10;
    }
    System.out.print("A Count Digit in number Is " + c);
    System.out.println();
  }

  void firstAndLastDigt(int x) {
    int l = x % 10;
    int f = 0;
    for (int i = 1; x != 0; i++) {
      f = x % 10;
      x /= 10;
    }
    System.out.println("First Digit " + f);
    System.out.println("Last Digit " + l);
  }

  void sumFirstAndLastDigt(int x) {
    int l = x % 10;
    int f = 0;
    for (int i = 1; x != 0; i++) {
      f = x % 10;
      x /= 10;
    }
    /*
      System.out.println("First Digit "+f);
       System.out.println("Last Digit "+l);
     */
    System.out.print("Sum Digit " + (f + l));
    System.out.println();
  }

  void swapFirstAndListDigt(int x) {
    int l = x % 10;
    int n = x / 10;
    int f = 0, r = 0, r1 = 0, sum1 = 0, sum = 0, t = 0, s = 0;

    for (int i = 1; n != 0; i++) {
      r = n % 10;
      sum = r + (10 * sum);
      n /= 10;
    }
    t = sum / 10;
    f = sum % 10;
    s = (t * 10) + l;

    for (int i = 1; s != 0; i++) {
      r1 = s % 10;
      sum1 = r1 + (10 * sum1);
      s /= 10;
    }
    int swap = (sum1 * 10) + f;
    System.out.println("Number First And Last Swap Is  " + swap);
  }

  void sumOfDigt(int x) {
    int r = 0, s = 0;
    for (int i = 1; x != 0; i++) {
      r = x % 10;
      s = s + r;
      x /= 10;
    }
    System.out.print("Sum of Digits Is " + s);
  }

   void productDigits(int x){
     int r=0,s=1; 
   
    for(int i=1;x!=0;i++){
      r=x%10;
      s=s*r;
      x/=10;
     }
   System.out.println("Product This Num Is "+s);
   }
   
   void reversNum(int x){
   int r=0,s=0;
   for(int i=1;x!=0;i++){
     r=x%10;
     s=r+(s*10);
     x/=10;    
   }
  System.out.println("Revers Num Is "+s);
  }

  void palindromeNum(int x){
    int r=0,s=0,tem=x;
  for(int i=1;x!=0;i++){
    r=x%10;
    s=(s*10)+r;
    x/=10;
   }
    int sum=s+tem;
  // System.out.println("Sum Palindrome "+sum);
   if(s==tem)
  System.out.println("This Is Palindrome");
  else
  System.out.println("This Is Not Palindrome");
 }
 
 void swapTwoNum(int a,int b){
     a=a+b;
      b=a-b;
      a=a-b;
    System.out.print("Swap Two Digit "+a+" "+b);
 }

  void sumOfOneToN(int x){
    int tem=0;
  for(int i=1;i<=x;i++){
   tem +=i;
  }
 System.out.print(tem);
}   
   void lcmTwoNum(long a,long b){
       long x=a>b?a:b;
    
    for(int i=1;i!=0;i++){
     if(x%a==0 && x%b==0){
      System.out.println(x);
      break;
     }
     ++x;
    }
   }

void hcfTwoNum(long a,long b){
       long x=a>b?a:b;
        long tem=0;
    for(int i=1;i<=x;i++){
     if(a%i==0 && b%i==0){
      tem=i;
     }
    }
   System.out.println(tem);
   }

   void checkkPrimeOrNot(int x){
    int count=0;
   for(int i=2;i<=x;i++){
    if(x%i==0){
     count++;
    }
 }
   if(count==1)
   System.out.println("its prime ");
   else
   System.out.println("its not prime ");
     }


 void checkk1ToNPrime(int x){
    
     for(int j=2;j<=x;j++){
     int count=0;
      for(int i=1;i<=j;i++){
        if(j%i==0)
        count++;
      }
   if(count==2)
    System.out.println("its prime "+j);
    }
  }
  
  void sum1ToNPrime(int x){
     int tem=0;
     for(int j=2;j<=x;j++){
       int count=0;
       for(int i=1;i<=j;i++){
        if(j%i==0)
        count++;
      }
       if(count==2){
       System.out.println("its prime "+j);
       tem+=j;
       }
      }
     System.out.println("Sum of prime "+tem);
    }

     
   void allPrimeFactor(int x){
     int tem=x;
    for(int i=1;i<=x;i++){
      if(tem%i==0)
         System.out.print(" "+i); 
     }
      System.out.println();
   }

   void checkNumArmstrong(int x){
         int s=0,r=0;
          int t=x;
        for(int i=1;x!=0;i++){
   	   r=x%10;
    	   s=s+(r*r*r);
    	   x/=10;
          }
        if(t==s)
        System.out.println("Its Armstrong ");
        else
        System.out.println("Its not Armstrong ");
      }

   void armstrong1ToN(int x){
      
     for(int i=1;i<=x;i++){
         int s=0,r=0;    
  	int t=i;
         int e=t;
       for(int j=1;t!=0;j++){
        r=t%10;
        s=s+(r*r*r);
        t/=10;
       }
     if(e==s)
    System.out.print(" "+s);
     }
  }

  void checkNumStrongOrNot(int x){
   int r=0,tem=x,sum=0,f=0,sub=0;
   for(int i=1;x!=0;i++){
     sum=0;
     f=1;
     r=x%10;
    for(int j=1;j<=r;j++){
     f=f*j;
     sum=f;
    }
    sub=sub+sum;
    x/=10;
   }
    if(tem==sub)
   System.out.print("Strong");
   else
    System.out.print(" Not Strong "+sub);
   System.out.print(" "+tem);
 }
      

  void check1ToNStrongNum(int x){   
    




  }

  void fibonacciSeries(int x){ 
    int a=0,b=1,c=0;
   for(int i=0;i<=x;i++){
     for(int j=1;j<=i;j++){
     c=a+b;    
   }
   
   System.out.print(" "+c);
    a=b;
    b=c;
    c=0;
  }
  }


  /*------------------------------------------------------*/
  public static void main(String[] RK) {
    ForLoopAllQ fq = new ForLoopAllQ();

    int x = 10;
    int alpha = 26;
    int st = 1;
    int ed = 10;
    

    /*----------------------------------------------*/

    
    /*fq.num1ToN(x);
      fq.revNTo1(x);
      fq.alphabetAToZ(alpha);
      fq.revAlphabetZToA(alpha);
      fq.oddNumber(st,ed);
      fq.evenNumber(st,ed);
      fq.table(71,72);
      fq.countNumDigit(x);
      fq.firstAndLastDigt(123);
      fq.sumFirstAndLastDigt(123);
      fq.swapFirstAndListDigt(12345);
      fq.sumOfDigt(123);
      fq.productDigits(434); 
      fq.reversNum(1234); 
      fq.palindromeNum(121);
      fq.swapTwoNum(5,3);
      fq.sumOfOneToN(5); 
      fq.lcmTwoNum(72,120); 
      fq.hcfTwoNum(12,18);
      fq.checkkPrime(17);
      fq.checkk1ToNPrimeOrNot(15); 
      fq.sum1ToNPrime(6); 
      fq.allPrimeFactor(10);
      fq.checkNumArmstrong(371);
      fq.armstrong1ToN(999); 
      fq.checkNumStrongOrNot(15); 
      fq.check1ToNStrongNum(145); */ 
      fq.fibonacciSeries(10);
      
      
    

  }
}