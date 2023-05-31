import java.util.Scanner;

 class ForLoopAllPattern{

 void solidRectangle(int x ){
    for(int i=1;i<=x;i++){
     for(int j=1;j<=x+4;j++){
      System.out.print(" *");
     }
     System.out.println();
    }
    System.out.println();
  }

 void solidPattern(int x){
   for(int i=1;i<=x;i++){
      for(int j=1;j<=x;j++){
       System.out.print(" *");
      }
     System.out.println();
    }
   System.out.println();
  }

 void numberSquar(int x){
   for(int i=1;i<=x;i++){
     for(int j=1;j<=x;j++){
     System.out.print(" "+j);
     }
    System.out.println();
   }
   System.out.println();
 }

 void numberNSquar(int x){
  int n=1;
   for(int i=1;i<=x;i++){
     for(int j=1;j<=x;j++){
     System.out.print(" "+n++);
     }
    System.out.println();
   }
   System.out.println();
 }

  void numberNNSquar(int x){
   for(int i=1;i<=x;i++){
     for(int j=1;j<=x;j++){
     System.out.print(" "+i);
     }
    System.out.println();
   }
   System.out.println();
 }

void alphabetSquar(int x){
    
   for(int i=1;i<=x;i++){
    char ch =65;
     for(int j=1;j<=x;j++){
     System.out.print(" "+ch++);
     }
    System.out.println();
   }
   System.out.println();
 }

void alphabetNSquar(int x){
    char ch =65;
   for(int i=1;i<=x;i++){ 
     for(int j=1;j<=x;j++){
     System.out.print(" "+ch++);
     }
    System.out.println();
   }
   System.out.println();
 }

 void alphabetNNSquar(int x){
   char ch =65;
   for(int i=1;i<=x;i++){ 
    for(int j=1;j<=x;j++){
     System.out.print(" "+ch);
     }
    System.out.println();
      ch++;
   }
   System.out.println();
 }

  void starTraingle(int x){
  for(int i=1;i<=x;i++){
   for(int j=1;j<=i;j++){
     System.out.print(" *");
    }
   System.out.println();
  } 
 System.out.println();
}

void numberTraingle(int x){
  for(int i=1;i<=x;i++){
   for(int j=1;j<=i;j++){
     System.out.print(" "+j);
    }
   System.out.println();
  } 
 System.out.println();
}

 void numberNTraingle(int x){
   int n=1;
  for(int i=1;i<=x;i++){
   for(int j=1;j<=i;j++){   
     System.out.print(" "+n++);
    
    }    
   System.out.println();
  } 
 System.out.println();
}

void alphabetTraingle(int x){
  for(int i=1;i<=x;i++){
   char ch =65;
   for(int j=1;j<=i;j++){
     System.out.print(" "+ch++);
    }
   System.out.println();
  } 
 System.out.println();
}

void alphabetNTraingle(int x){
 char ch =65;
  for(int i=1;i<=x;i++){
   for(int j=1;j<=i;j++){
     System.out.print(" "+ch++);
    }
   System.out.println();
  } 
 System.out.println();
}

  void starTriangleInverted(int x){
   int n=x;
  for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
       System.out.print(" *");
     }
     n--;
    System.out.println();
  }
 System.out.println();
 }

 void numTriangleInverted(int x){
   int n=x;
  for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
       System.out.print(" "+j);
     }
     n--;
    System.out.println();
  }
 System.out.println();
 }

void numNTriangleInverted(int x){
   int n=x;
  for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
       System.out.print(" "+i);
     }
     n--;
    System.out.println();
  }
 System.out.println();
 }

void numNnTriangleInverted(int x){
   int n=x;
   int m=1;
  for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
       System.out.print("  "+m++);
     }
     n--;
    System.out.println();
  }
 System.out.println();
 }
 
 void alphabetTriangleInverted(int x){
     int n=x;
   for(int i=1;i<=x;i++){
     char ch = 65;
     for(int j=1;j<=n;j++){
        System.out.print(" "+ch++);
     }
     n--;
     System.out.println();
  }
 System.out.println();
}

void alphabetNTriangleInverted(int x){
     int n=x;
    char ch = 65;
   for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
        System.out.print(" "+ch);
     }
     n--;
     ch++;
     System.out.println();
  }
 System.out.println();
}

void alphabetNnTriangleInverted(int x){
     int n=x;
    char ch = 65;
   for(int i=1;i<=x;i++){
     for(int j=1;j<=n;j++){
        System.out.print(" "+ch++);
     }
     n--;
     System.out.println();
  }
 System.out.println();
}

 void oddNumTriangle(int x){
     
  for(int i=1;i<=x;i++){    
      int  n=1;
   for(int j=1;j<=i;j++){
     System.out.print(" "+n);
       n=n+2;
   } 
     
      System.out.println();
  }
}

 void oddNumTriangleSeris(int x){
     int  n=1;
  for(int i=1;i<=x;i++){    
   for(int j=1;j<=i;j++){
     System.out.print(" "+n);
       n+=2;
   } 
     
      System.out.println();
  }
}

void evenNumTriangle(int x){
   for(int i=1;i<=x;i++){
       int a=2;
      for(int j=1;j<=i;j++){
     System.out.print(" "+a);
     a+=2;
  }
    System.out.println();
  }
  System.out.println();

}

void evenNumTriangleSeris(int x){
   int a=2;
   for(int i=1;i<=x;i++){
      for(int j=1;j<=i;j++){
     System.out.print(" "+a);
     a+=2;
  }
    System.out.println();
  }
  System.out.println();

}

  void numAndAlphaberTriangle(int x){
    for(int i=1;i<=x;i++){
      int a =1; 
      char ch = 65;
     for(int j=1;j<=i;j++){
       if(i%2!=0)
       System.out.print(" "+a++);
       else
      System.out.print(" "+ch++);
    }
    System.out.println();
  }
}

   void starPlus(int x){
       int n=x;
      int a =n/2+1;
     for(int i=1;i<=x;i++){
     for(int j=1;j<=x;j++){
        if(i==a||j==a)
    	System.out.print(" *");
        else
        System.out.print("  ");
    }
    System.out.println();
    }
   }

  void numAndAlphaberPlus(int x){
      int n=x;
      int b=n/2+1;
    int a =1;
   char ch = 65;
   for(int i=1;i<=x;i++){
   for(int j=1;j<=x;j++){
    if(i==b)
      System.out.print(" "+a++);
    else if(j==b)
    System.out.print(" "+ch++);
    else
   System.out.print("  ");
}
  System.out.println();
}
}

 void hollowRectangle(int x ){
  int n=x;
   int a = x-1;
 for(int i=1;i<=a;i++){
    for(int j=1;j<=x;j++){
      if((i==1||j==1)||(i==a||j==n))
       System.out.print(" *");
      else
       System.out.print("  ");
   }
  System.out.println();
   }
 }

  void starCross(int x){
   int s=x;
   int a=1;
  for(int i=1;i<=x;i++){
    for(int j=1;j<=x;j++){
     if((i==a&&j==i)||(i==a&&j==s))
      System.out.print("*");
     else
     System.out.print(" ");
   }
   a++;
   s--;
  System.out.println();
 }
 }
 
 void zeroOneTringle(int x){
 for(int i=1;i<=x;i++){
    for(int j=1;j<=i;j++){
     if((i+j)%2==0) 
     System.out.print("1");
   else
  System.out.print("0");
   } 
System.out.println();
  }
}

 void starTraingleMast(int x){
	/*int sp=x;
	for(int i=1;i<=x;i++){
		for(int s=1;s<sp;s++){
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++){
			System.out.print(" *");
		}
		sp--;
		System.out.println();	
	}*/
	
	//second way
	int a=x;
	int k=1;
	for(int i=1;i<=x;i++){
		for(int j=1;j<=x;j++){
			if(i==k&&j<a)
				System.out.print("  ");
			else
				System.out.print(" *");
		}
		k++;
		a--;
		System.out.println();
	}				
 }
 
 void alphabetTriangleMast(int x){
	 int k=1;
	 int a=x;
	 for(int i=1;i<=x;i++){
		 char ch=65;
		 for(int j=1;j<=x;j++){
			if(i==k&&j<=a)
				System.out.print(" ");
			else
				System.out.print(ch++);
		 }
		 a--;
		 k++;
		 System.out.println();
	 }
	 
 }
 
 void starPramid(int x){
	    int a=1;
		int n=0;
		
		for(int i=1;i<=x;i++){
			for(int j=1;j<=(x*2)-1;j++){
				if(i==a && j>=(x-n)&&j<=(x+n))
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			a++;
			n++;
			System.out.println();
		} 
     }
 void starAlphabetPramid(int x){
	 int a= 1;
	 int n=0;
	 for(int i=1;i<=x;i++){
		 char ch = 65;
		 for(int j=1;j<=(x*2)-1;j++){
			 if(i==a && j>=(x-n)&&j<=(x+n))
            System.out.print(ch++);
            else
            System.out.print(" ");				
		 }
		 a++;
		 n++;
		 System.out.println();
	 }	 
   }
   
   void starDigitPramid(int x){
	 int a= 1;
	 int n=0;
	
	 for(int i=1;i<=x;i++){
		  int d=1;
		 for(int j=1;j<=(x*2)-1;j++){
			 if(i==a && j>=(x-n)&&j<=(x+n))
            System.out.print(d++);
            else
            System.out.print(" ");				
		 }
		 a++;
		 n++;
		 System.out.println();
	 }	 
   }
   
   void numberPramidMast(int x){
	 int a= 1;
	 int n=0;
	
	 for(int i=1;i<=x;i++){
		  int d=1;
		 for(int j=1;j<=(x*2)-1;j++){
			 if(i==a && j>=(x-n)&&j<=(x+n)){       
			 if(d<=a)
			 System.out.print(" "+d++);
			 }
            else
            System.out.print(" ");				
		 }
		 a++;
		 n++;
		 System.out.println();
	 }	 
   }
 void CroxPattern(int x){
	 for(int i=1; i<=x; i++){
		 for(int j=1; j<=x;j++){
			 if(i==j||j==(x+1)-i)
				 System.out.print(" *");
			 else
				 System.out.print("  ");	 
		 }
		 System.out.println();
	 }
 }
 void NumberRevPramidMast(int x){
	
	 
	 for(int i=1;i<=x;i++){
		  int a=0;
		 for(int j=1;j<=i;j++){
			 System.out.print(i-a);
			 a++;
			
		 }
		 System.out.println();
	 }
 }
 void NumberPramidMast(int x){
	int sp=x;
	 
	 for(int i=1;i<=x;i++){
		 int n=1;
		 int l=i-1;
		  for(int s=1; s<=sp;s++){
			   System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++){
			  System.out.print(n);
			  n++;
		  }
		   for(int k=1;k<i;k++){
			  System.out.print(l);
			  l--;
		  }
		  
		  sp--;
		 System.out.println();
	 }
 }
 
 /*void AlphaPramidMast(int x){
	char c = 65;
	
	int n = 1;
	for(int i=1;i<=x;i++){
		char ch= 65;
		
		for(int j=1;j<=i;j++){
			System.out.print(ch);
			ch++;
		}
		for(int k=1;k<=i;k++){
			if(c==65){
			System.out.print(c);}
			else if(c>=65){
			System.out.print(c--);}
		}
		c++ ;
		System.out.println();
	}
 }
 */
 
/*************************************************/

public static void main(String[]args){
  
ForLoopAllPattern pq = new ForLoopAllPattern();
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Value :=> ");
 
  int x = sc.nextInt();
 
   
       
 
 
 /*
  pq.solidRectangle(x);
  pq.solidPattern(x);
  pq.numberSquar(x);
  pq.numberNSquar(x);
  pq.numberNNSquar(x);
  pq.alphabetSquar(x);
  pq.alphabetNSquar(x);
  pq.alphabetNNSquar(x);
  pq.starTraingle(x);
  pq.numberTraingle(x);
  pq.numberNTraingle(x); 
  pq.alphabetTraingle(x);
  pq.alphabetNTraingle(x);
  pq.starTriangleInverted(x);
  pq.numTriangleInverted(x);
  pq.numNTriangleInverted(x);
  pq.numNnTriangleInverted(x);
  pq.alphabetTriangleInverted(x);
  pq.alphabetNTriangleInverted(x);
  pq.alphabetNnTriangleInverted(x);
  pq.oddNumTriangle(x); 
  pq.oddNumTriangleSeris(x); 
  pq.evenNumTriangle(x);
  pq.evenNumTriangleSeris(x);
  pq.numAndAlphaberTriangle(x); 
  pq.starPlus(x);  
  pq.numAndAlphaberPlus(x);
  pq.hollowRectangle(x);  
  pq.starCross(x);  
  pq.zeroOneTringle(x); 
  pq.starTraingleMast(x); 
  pq.alphabetTriangleMast(x);
  pq.starPramid(x); 
  pq.starAlphabetPramid(x); 
  pq.starDigitPramid(x);  
  pq.numberPramidMast(x);
  pq.CroxPattern(x); 
  pq.NumberRevPramidMast(x);
  pq.NumberPramidMast(x); */
  pq.AlphaPramidMast(x);
  
}
}