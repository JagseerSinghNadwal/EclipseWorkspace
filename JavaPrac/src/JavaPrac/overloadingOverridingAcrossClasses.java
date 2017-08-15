package JavaPrac;


	class ABCD
	{
	    public void fun()
	    {
	        System.out.println("class ABCD:overloading0");
	    }
	    
	    public void fun(int i)
	    {
	        System.out.println("class ABCD:overloading1 "+i);
	    }
	}
	public class overloadingOverridingAcrossClasses extends ABCD
	{
	    
	    public void fun(int i)
	    {
	        System.out.println("class overloadingOverridingAcrossClasses:overriding "+i);
	    }
	    
	  //duplicate method not allowed inside the class either it should be across the classes for overriding or overloaded with new fun prototy
	    /*public int fun(int j)   
	    {
	        System.out.println("class GFG:overriding "+i);
	       // return 1;
	    }*/
	    
	    public int fun(int i,int j)
	    {
	        System.out.println("class overloadingOverridingAcrossClasses:TryingToOverloading3 "+i);
	       return 1;
	    }
	    
		public static void main(String[] args)
		{
		System.out.println("-------------reference of parent class and object of child class----------");
		ABCD g= new overloadingOverridingAcrossClasses();
		g.fun();
		g.fun(2); 
		//g.fun(2,3);  overloading only can happen inside the class
		System.out.println("\n------------Object and reference of child class------------------");
		overloadingOverridingAcrossClasses g1= new overloadingOverridingAcrossClasses();
		System.out.print("Inherited from ABCD -->");
		g1.fun();
		g1.fun(2);
		g1.fun(2, 3);  
		}
	}
		
	

