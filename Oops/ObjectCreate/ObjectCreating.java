
class ObjectCreating{
	
public static void main(String[]args){
   ObjectCreating obj= null;
   /*class type varible also null ans this is call Refrance varible 
   and this location stack area.
   */
   System.out.println("The value of ref var null "+obj);
   obj = new ObjectCreating(); 
   /*Create object and memory location Heap area 
    this is dynamic*/
   System.out.println("The value of ref Id obj "+obj);
   

  }
}