class Father{
int x=10;
}
class Son extends Father{
	int x = 20;
void show(int x){
 System.out.println("Father Class X "+super.x);
 System.out.println("Son Class X "+this.x);
 System.out.println("Local Class X "+x);
 }
 }
 class SuperThis{
 public static void main(String[]args){
 Son s = new Son();
 s.show(30);
 }
 }