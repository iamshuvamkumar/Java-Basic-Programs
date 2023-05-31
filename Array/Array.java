class Array{
	
	static void OnetoN(int x){
	int i,j=1;
	int n[] =  new int[x];
	int a= n.length;
    for(i=0; i<a;i++){
    n[i]=j;
	j++;
	}
	for(i=0; i<a;i++){
  System.out.print(" "+n[i]);
 }
}

static void Reverse(int x[]){
		int n=x.length;
		for(int i=1;i<=x.length;i++){
			System.out.print(" "+x[n-1]);
			n--;
		}
	}
	
public static void main(String[]args){
 int x[]={1,2,3,4,5};
  OnetoN(5);
  System.out.println();
  Reverse(x);
 
 
 }
}