class WapperParse{
	
	public static void main(String[]args){
		byte b = Byte.parseByte("10");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("1000");
		long l = Long.parseLong("10000");
		float f = Float.parseFloat("100.111");
		double d = Double.parseDouble("1111.111");
	
     	System.out.println(" Byte  B "+b);		
		System.out.println(" Short S "+s);
		System.out.println(" Int I "+i);
		System.out.println(" Long L "+l);
		System.out.println(" Float F "+f);
		System.out.println(" Double D "+d);
	 }
	}