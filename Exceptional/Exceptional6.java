//nested try black
class Exceptional6{
	public static void main(String[]s){
		try{
			int x= 10/s.length;
			System.out.println(x);
			try{
				int y[] = new int[s.length];
				y[4]=5454;
				System.out.println(y[4]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(" this is ArrayIndexOutOfBoundsException");
			}
			}
			catch(ArithmeticException e){
				System.out.println("This is ArithmeticException");
			}
		
	}
}