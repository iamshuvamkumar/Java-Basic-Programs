//The perent child mathod Mark final can't be Override in child class

class base{
	final void show(){
		System.out.println("This is base class show method");
	}
}
class child extends base{
    void show(){
		System.out.println("This is base class show method");	
}
}

class TextOverridding6{
	public static void main(String[]args){
		child c1 = new child();
		c1.show();
	}
}