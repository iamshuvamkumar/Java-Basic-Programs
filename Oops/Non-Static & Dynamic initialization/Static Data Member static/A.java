//Static Data Member static Initi

class A{
   static int x=10;
public static void main(String...s){
System.out.println("Main method in A Class ");
System.out.println(" X  ="+x);
}
}
class B{
   public static void main(String...s){
    System.out.println("Main method in B Class ");
     System.out.println(" X  ="+A.x);
   }
}
class C{

   public static void main(String...s){
    System.out.println("Main method in C Class ");
     System.out.println(" X  ="+A.x);
  }
}
class D{
   public static void main(String...s){
    System.out.println("Main method in D Class ");
     System.out.println(" X  ="+A.x);
    }
}