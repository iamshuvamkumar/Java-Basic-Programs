//Integer Wapper class 
//equal method is object class  its  only chack contant
 class Wap{
	 String str;
	 Wap(){}
	 Wap(String str){this.str=str;}
	 public String toString(){
		 return str;
	 }
	 public boolean equals(Object ob){
		 Wap t1 = (Wap)ob;
		 if(this.str == t1.str)
			 return true;
		 else
		 return false;
	 }
 }
 
 class Wapper{
	 public static void main(String[]args){
        Wap obj = new Wap("123"); //change the  ref id temp
         System.out.println("The Ref Id of Wap obj "+obj);		
	      
	  Wap obj1 = new Wap("123"); //change the  ref id temp
     System.out.println("The Ref Id of Wap obj1 "+obj1);
	 //compier 
	 System.out.println("obj==obj1 "+(obj==obj1));            
	 System.out.println("tto create Boolean method obj.equals(obj1) "+obj.equals(obj1));

	Integer iobj = new Integer(100);
	System.out.println("Integer iobj "+iobj);            

	Integer iobj1 = new Integer(100);
	System.out.println("Integer iobj1 "+iobj1);
    //compiar
	System.out.println("iobj == iobj1 "+(iobj==iobj1));			
	      //Equals
    System.out.println("iobj.equals(iobj1) "+iobj.equals(iobj1));		  
	}
 }