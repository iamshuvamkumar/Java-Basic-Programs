//one try block one catch block using if condation
class Exceptional4{
	public static void main(String[]s){
		System.out.println("Start main Method "+s.length);
		try{
			System.out.println("Start in try block ");
			int x = 10/s.length;
            System.out.println("x = "+x);	
			
			int y[] = new int[s.length];
			y[5]=85296;
			System.out.println(" y[5] "+y[5]);
		}
		catch(Exception e){
			if(e instanceof ArithmeticException )
				System.out.println("AirthMaticEException ");
			if(e instanceof ArrayIndexOutOfBoundsException )
				System.out.println("ArrayIndexOutOfBoundsException ");
		}
	}
}