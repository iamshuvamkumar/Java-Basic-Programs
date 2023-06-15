class SBuilderDeletes{
	public static void main(String[]args){
		StringBuilder str = new StringBuilder("Shuvam Kumar");
		int x = str.length();
		System.out.println(x);
		str.delete(7,12);
		System.out.println(str);
	}
}