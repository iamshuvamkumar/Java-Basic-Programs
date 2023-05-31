class Emp3{
  String name;
  int eid;
  String address;
  int salary;
  static String cname="TCS";
  void getData(String n ,int id, String addr, int sal){
	  name = n;
	  eid = id;
	  address =addr;
	  salary = sal;
  }
  void show(){
	  System.out.println("\nDetails of Employ ");
	  System.out.println("Name  := "+name);
	  System.out.println("Id  := "+eid);
	  System.out.println("Address  := "+address);
	  System.out.println("Salary  := "+salary);
	  System.out.println("Company Name  := "+cname);
  }
  static void companyChange(String cn){
	  cname=cn;
  }
}

  class TestEmp{
	  public static void main(String args[]){
		  System.out.println("Start Main");
		  System.out.println("Company Name Main :="+Emp3.cname);
		  
		/* TestEmp text=new TestEmp();
		  System.out.println("The Reference Id of Obj. "+text);
		  text.show();\
		  class function only call class obj name with in  class method declear
		  in class 
		  */
		  Emp3 e1 = new Emp3();
		  System.out.println("The Reference Id of Obj. "+e1);
		  e1.getData("ABC",101,"Noida",10000);
		  e1.show();
		  System.out.println("Company Name Main e1:="+e1.cname);
		  System.out.println("Name Main e1 :="+e1.name);
		  
		  Emp3 e2 = new Emp3();
		  System.out.println("The Reference Id of e2 obj :="+e2);
		  e2.getData("Ram",343,"Dc",23423);
		  e2.show();
		  
		  Emp3 e3 = new Emp3();
		  System.out.println("The Reference id of e3 "+e3);
		  e3.getData("sdd",233,"dssd",3233);
		  e3.show();
		  //call in with class name
		  Emp3.companyChange("IBM");
		  e1.show();
		  e2.show();
		  e3.show();
		  //call in with class object
		  e1.companyChange("HCL");
		  e1.show();
		  e2.show();
		  e3.show();
		  System.out.println("End Main");
	  }
  }
