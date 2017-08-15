package JavaPrac;

class A
{
	/*	order:
		static
		instance
		contructor*/

	//A s = new A(); //if dont use static then stack overflow
	static int i=0;
	static int j=0;
	static A s = new A();    
	//if we use this then first static instance will be created as part of atatic instance intilization,then actual object object call will happen
	
	static 
	{
		i++;
		System.out.println("Static block "+ i +" executed once before instance block and contructor ");
	}
	{
		j++;
		System.out.println("instance block "+j+" executed befor constructor,irespective of constrctor type ");
	}
	
	A()
	{    //this makes class visibility hidden
		System.out.println("Object Constrctor "+j +" executed ");
	}
}

public class StaticCumStackOverFlowEx {
	public static void main(String[] args) 
	{
		//Even before object creation of class,when static member is accessed, class is intialized--
		System.out.println("---------- class load and initilization when static is accessed -----------");
		System.out.println(A.i); 
		
		System.out.println("--------------- object creation----------------");
		A scT = new A();
		
	}
}


