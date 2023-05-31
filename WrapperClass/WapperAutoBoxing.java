class WapperAutoBoxing{
	public static void main(String[]args){
	 Integer obj = new Integer(100);
	 Integer obj1 = new Integer(200);
	 System.out.println("Its Integer obj "+(++obj));
	 System.out.println("Its Integer obj1 "+(++obj1));
	 int x = obj.intValue(); //object into primitive(unboxing)
	 int y = obj1.intValue();
	 System.out.println(" X and Y "+(++x)+"  "+(++y));
	 
	 Byte Bobj = new Byte((byte)123);
     System.out.println("Its Byte Bobj "+Bobj+" "+(++Bobj));
	 
	Long Lobj = new Long(500000L);
	System.out.println("Its Long Lobj "+Lobj+" "+(++Lobj));
	 
	 Short Sobj = new Short((short)1250);
	System.out.println("Its Short Sobj "+Sobj+" "+(++Sobj));
	 
	 Float Fobj = new Float(5.00f);
     System.out.println("Its Float Fobj "+Fobj+" "+(++Fobj));
	 
	 Double Dobj = new Double(500.023);
	System.out.println("Its Long Lobj "+Dobj+" "+(++Dobj));
	
	 }
	}