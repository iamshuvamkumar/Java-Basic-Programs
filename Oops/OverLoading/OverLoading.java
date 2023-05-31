class OverLoading{ 
void show(){
	System.out.println("Empty");
}
	 void show(byte x){
		 System.out.println(" byte "+x);
	 }
	 void show(short x){
		 System.out.println(" Short "+x);
	 }
	 void show(int x){
		 System.out.println(" Int "+x);
	 }
	 void show(long x){
		 System.out.println(" Long "+x);
	 }
	 void show(float x){
		 System.out.println(" Float "+x);
	 }
	 void show(double x){
		 System.out.println(" Double  "+x);
	 }
	
	public static void main(String[]args){
	 OverLoading obj = new OverLoading();
	 obj.show();
	 obj.show((byte)5);
	 obj.show((short)5);
	 obj.show(5);
	 obj.show(556L);
     obj.show(50.25F);
     obj.show(5.0);
       	 
	}
}