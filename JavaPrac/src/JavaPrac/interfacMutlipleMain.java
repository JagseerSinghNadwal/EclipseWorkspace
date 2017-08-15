package JavaPrac;

interface inf
{
    void first();
    void second();
    void third();
    
}
 class interfacePract implements inf{
    
    public void first()
    {
        System.out.println("interfacePract-firsdt");
    }
    public void second()
    {
        System.out.println("interfacePract-second");
    }
    public void third()
    {
    System.out.println("interfacePract-third");
    }
	public static void main (String[] args) {
		interfacePract g= new interfacePract();
	g.first();
	g.second();
	g.third();
	  
	}
}
 
 
 class interfacePrac1 implements inf{
	    
	    public void first()
	    {
	        System.out.println("interfacePrac1-firsdt");
	    }
	    public void second()
	    {
	        System.out.println("interfacePrac1-second");
	    }
	    public void third()
	    {
	    System.out.println("interfacePrac1-third");
	    }
		public static void main (String[] args) {
		interfacePrac1 g= new interfacePrac1();
		g.first();
		g.second();
		g.third();
		  
		}
	}