class StaticCompanyName{

String EmpName;
int EmpId;
String EmpAddres;
int EmpSalary;
static String CompanyName = "Google"; //momery location in class method

 void getEmpDetails(String name,int id,String addres,int salary){
	   EmpName=name;
	   EmpId=id;
	   EmpAddres=addres;
	   EmpSalary=salary;
 }
void showEmpDetails(){
	System.out.println("Emp Details");
	System.out.println("Name => "+EmpName);
	System.out.println("Id   => "+EmpId);
	System.out.println("Addres => "+EmpAddres);
	System.out.println("Salary => "+EmpSalary);
	System.out.println("Company Name => "+CompanyName);
	System.out.println();
}
 public static void main(String args[]){
	 
	 StaticCompanyName obj = new StaticCompanyName();
	 obj.getEmpDetails("Shivam",5265374,"Faridabad",50000);
	 obj.showEmpDetails();	 
	 
	 StaticCompanyName obj1 = new StaticCompanyName();
	 obj1.CompanyName = "Amazone";
	 obj1.getEmpDetails("Amit",5265371,"Badarpur",600000);
	 obj1.showEmpDetails();
	 
	 obj.CompanyName= "MicroSoft";
	 obj.showEmpDetails();
	 
	 
 }
}