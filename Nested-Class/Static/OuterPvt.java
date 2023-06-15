class OuterPvt{
	int x =320;
	void show(){
		System.out.println("Show Mehtod for Outer2 ");
		System.out.println(" X "+x);
	}
	private static class Inner{
		int c = 23;
		static int p = 21;
		void get(){
			System.out.println("Get method for Inner class ");
		System.out.println("c = "+c);
		System.out.println("static P = "+p);
		}
	}
	
		public static void main(String[]args){
          		Inner in = new Inner();
				in.get();
				/*OuterPvt ot = new OuterPvt();
				ot.show();
				*/
		
		}
	}