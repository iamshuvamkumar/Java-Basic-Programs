package IOStream;

import java.lang.invoke.VolatileCallSite;

public class EmpSer extends IoSerializable{

	int a;
	String str;
	static int y;
	transient int z;
	volatile int b;
	int age;
	public EmpSer() {}
	public EmpSer(String str,int age,int a,int b,int x,int y,int z) {
     super();
     this.str=str;
     this.age=age;
     this.a=a;
     this.b=b;
//     this.x=x;
     this.y=y;
     this.z=z;
     
     
	}
	}