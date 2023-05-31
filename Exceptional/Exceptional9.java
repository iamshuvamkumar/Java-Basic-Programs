//throws Keyword

class Exceptional9{
	int div(int x,int y) throws Exception
	{
     return x/y;		
	}
	public static void main(String[]s)//throws Exception
	{
	 Exceptional8 obj = new Exceptional8();
	 //obj.div(15);
	 try{
		 obj.div(15);
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
		 System.out.println("Main end");
	 }
	}