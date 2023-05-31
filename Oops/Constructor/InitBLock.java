 class Temp{
	 Temp(){
		 System.out.println(" Defult Constructor ");
	 }
	 {
		 System.out.println(" InhitBLock 1st ");
	 }
	 Temp(int x ){
		  System.out.println(" Parimetrised Constructor "+x);
	 }
	 {
		 System.out.println(" InhitBLock 2st ");
	 }
 }
	 
 class InitBLock{
 public static void main(String[]args){
	 		 System.out.println(" obj 1 ");
	 new Temp();
	 System.out.println(" obj 2 ");
	 

 }
}