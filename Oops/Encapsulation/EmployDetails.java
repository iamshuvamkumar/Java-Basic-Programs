
class EmployDetails{
	 String employName;
	 int employId;
	 String employAddres;
	 int employSalary;
	 
	 void getEmployData(String name ,int id ,String addres ,int salary){
	 employName = name;
	 employId  = id;
	 employAddres = addres;
	 employSalary = salary;
	 }
	 void showEmployData(){
		 System.out.println("Datails Of Employ ");
		 System.out.println("Name of Employ => "+employName);
		 System.out.println("Employ Id      => "+employId);
		 System.out.println("Employ Address => "+employAddres);
		 System.out.println("Employ Salary  => "+employSalary);
		  System.out.println();
	 }

public static void main(String[]args){
	System.out.println("Start Main Method ");
	System.out.println();
	
	//Create Class Object
  EmployDetails emp = new EmployDetails();
  System.out.println("Refrance Varible Of Class Object Emp "+emp);
  emp.showEmployData(); 
  emp.getEmployData("Shivam",5265374,"Noida Sector 16",100000);   
  emp.showEmployData();
  
  //Create Class Object1
  EmployDetails emp1 = new EmployDetails();
  System.out.println("Refrance Varible Of Class Object Emp1 "+emp1);
  emp1.showEmployData();
  emp1.getEmployData("Megha",5265371,"Badalapur",50000);
  emp1.showEmployData();
  
   //Create Class Object2
  EmployDetails emp2 = new EmployDetails();
  System.out.println("Refrance Varible Of Class Object Emp2 "+emp2);
  emp2.showEmployData();
  emp2.getEmployData("Kajal",5265372,"Mirzapur",10000);
  emp2.showEmployData();
  
  emp.showEmployData();
  emp1.showEmployData();
  emp2.showEmployData();
  
  //Change the emp1 Employ Detail
  emp1.getEmployData("Cooldeep",5265373,"Ashok Nagar",5000);
  emp1.showEmployData();
  
  //Change the Employ class Address
  emp2 = new EmployDetails();
  System.out.println("The ref id of emp2 "+emp2);
  emp2.getEmployData("Anjali",5265375,"Noida-15",120000);
  emp2.showEmployData();
  
	System.out.println("End Main Method ");  
 }
}