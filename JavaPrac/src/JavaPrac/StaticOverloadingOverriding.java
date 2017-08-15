package JavaPrac;

class Par
{
	static void fun()
	{
		System.out.println("par static fun");
	}
	
	static void fun(int i)
	{
		System.out.println("par static fun (int ) overloaded");
	}
	 void fun2()
	{
		System.out.println("par fun2");
	}
	
	 void fun2(int i)
	{
		System.out.println("par fun2 (int ) overloaded");
	}
	 
	 void fun3()
		{
			System.out.println("par fun3");
		}
}

class chl extends Par
{
	static void fun()  //it wont be override as static
	{
		System.out.println("chl static fun");
	}
	
	static void fun1()   //it wont be override as static 
	{
		System.out.println("chl static fun1");
	}
	 void fun2()	//it wiil override as non static
		{
			System.out.println("chl fun2 overridden for base class ");
		}
}

public class StaticOverloadingOverriding {

	public static void main(String[] args) 
	{
		//in case of static overloading works fine and overriding does not as static belongs to class not object
		Par p =new chl();
		p.fun();    //function overriding does not happen for static
		p.fun(1);   //function overloading works fine for static (within parent class only)
		p.fun2();   //non static overridden
		
		chl c = new chl();
		c.fun();
		c.fun2();
	}

}
