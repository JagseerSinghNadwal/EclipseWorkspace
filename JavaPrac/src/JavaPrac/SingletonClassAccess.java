package JavaPrac;

class SingletonClass
{
	static SingletonClass s = new SingletonClass();
	private static int i;
	private SingletonClass()
	{    
		//this makes class visibility hidden
		i++;
		System.out.println("Public constrctr "+i);
	}
	public static SingletonClass  getInstance() 
	{
			return s;
	 }
	public static void fun()
	{
		System.out.println("Inside fun of singleton class, instance "+i);
	}
}

public class SingletonClassAccess {
	public static void main(String[] args) {
		//SingletonClass scT = new SingletonClass();  //not able to create the object
		SingletonClass sc,sc1;
		
		sc = SingletonClass.getInstance();
		sc.fun();  //method 1 to access inside fun

		sc1 = SingletonClass.getInstance();
		sc1.fun();
		
		SingletonClass.getInstance().fun(); //method 2 to access inside fun
	}
}


