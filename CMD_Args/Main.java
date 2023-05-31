class Main{
	public static void main(String[]args){
		System.out.println("main method []args ");
		main("hi main");
		main(123);
		main(123.545f);
		
	}


	/*public static void main(String...s){
		System.out.println("main method ...s ");
}*/

	public static void main(String s){
		System.out.println("main method String s "+s);
}

	public static void main(int s ){
		System.out.println("main method Int s"+s);
	}


	public static void main(float s){
		System.out.println("main method Float s "+s);
	}

}