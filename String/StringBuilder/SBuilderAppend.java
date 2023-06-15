class SBuilderAppend{
	public static void main(String[]args){
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str.length());
		System.out.println(str);
		str.append(" Java");
		System.out.println(str);
		
	}
}