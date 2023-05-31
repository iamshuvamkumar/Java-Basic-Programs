class WapperVlaueOf{
	String str;
	WapperVlaueOf(){}
	WapperVlaueOf(String str){
		this.str=str;
	}
	public String toString(){
		Integer istr = Integer.valueOf(str);
		return istr.toString();
	}
	public static void main(String[]args){
		WapperVlaueOf obj = new WapperVlaueOf("100");
		System.out.println("The ref id "+obj);
		System.out.println();
		

		Byte Bobj = (byte)100;
		Byte Bobj1 = new Byte((byte)101);
		Byte Bobj2 = Byte.valueOf((byte)102);
		Byte Bobj3 = Byte.valueOf("103");
		
		System.out.println("Byte "+Bobj);
		System.out.println("Byte Bobj1 "+Bobj1);
		System.out.println("Byte valueOf Bobj2  "+Bobj2);
		System.out.println("Byte valueOf String Bobj3 "+Bobj3);
		System.out.println();

		
		Short Sobj = (short)1120;
		Short Sobj1 = new Short((short)1121);
		Short Sobj2 = Short.valueOf((short)1122);
		Short Sobj3 = Short.valueOf("1123");
		
		System.out.println("Short "+Sobj);
		System.out.println("Short Sobj1 "+Sobj1);
		System.out.println("Short valueOf Sobj2  "+Sobj2);
		System.out.println("Short valueOf String Sobj3 "+Sobj3);
		System.out.println();
		
		Integer iobj =1000;
		Integer iobj1 = new Integer(1001);
		Integer iobj2 = Integer.valueOf(1002);
		Integer iobj3 = Integer.valueOf("1003");
	
		System.out.println("integer "+iobj);
		System.out.println("integer iobj1 "+iobj1);
		System.out.println("integer valueOf iobj2  "+iobj2);
		System.out.println("integer valueOf String iobj3 "+iobj3);
		System.out.println();
		
		Long Lobj = 100000L;
		Long Lobj1 = new Long(100001L);
		Long Lobj2 = Long.valueOf(100002L);
		Long Lobj3 = Long.valueOf("100003");
		
		System.out.println("Long "+Lobj);
		System.out.println("Long Lobj1 "+Lobj1);
		System.out.println("Long valueOf Lobj2  "+Lobj2);
		System.out.println("Long valueOf String Lobj3 "+Lobj3);
		System.out.println();
		
		Float Fobj = 10.20f;
		Float Fobj1 = new Float(10.21f);
		Float Fobj2 = Float.valueOf(10.22f);
		Float Fobj3 = Float.valueOf("10.23");
		
		System.out.println("Float "+Fobj);
		System.out.println("Float Fobj1 "+Fobj1);
		System.out.println("Float valueOf Fobj2  "+Fobj2);
		System.out.println("Float valueOf String Fobj3 "+Fobj3);
		System.out.println();
		
		Double Dobj = 10.220;
		Double Dobj1 = new Double(10.221);
		Double Dobj2 = Double.valueOf(10.222);
		Double Dobj3 = Double.valueOf("10.223");
		
		System.out.println("Double "+Dobj);
		System.out.println("Double Dobj1 "+Dobj1);
		System.out.println("Double valueOf Dobj2  "+Dobj2);
		System.out.println("Double valueOf String Dobj3 "+Dobj3);
		System.out.println();
		 
		
		
	}
}
	