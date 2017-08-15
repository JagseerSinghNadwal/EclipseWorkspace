package JavaPrac;

class ABC
{
	static int i =10;
	static ABC obj = new ABC();
	
	public ABC() 
	{
		//System.out.println("constructor");
	}
	
	public static ABC funct() 
	{
		return obj;
	} 
}

public class StaticObjectInitilization {

	public static void main(String[] args) 
	{
		ABC a1 = null;
		ABC a2 = ABC.funct(); 
		ABC a3 = new ABC();
		ABC a4 = new ABC();
		ABC a5 = ABC.funct();
		
		System.out.println("--------ABC Reference Vars-------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		System.out.println("\n---------ABC Static instance --------");
		System.out.println(ABC.obj);
		System.out.println(a1.obj);
		System.out.println(a2.obj);
		System.out.println(a3.obj);
		System.out.println(a4.obj);
		System.out.println(a5.obj);
		System.out.println(new ABC());
	}
}
