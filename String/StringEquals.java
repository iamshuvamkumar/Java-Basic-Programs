class StringEquals{
	public static void main(String[]args){
		String str = "Shuvam";
		String str1 = "Shuvam";
		String str2 = new String("Shuvam");
		
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
	}
}