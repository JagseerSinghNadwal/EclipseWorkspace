package JavaPrac;

abstract class absClass
{
    abstract void first();
    void second() {
	}
    abstract void third();
    
}

abstract class abstractOne extends absClass    //if we dont 
{
	public void first()
    {
        System.out.println("abstractClasss-firsdt");
    }
    public void second()
    {
        System.out.println("abstractClasss-second");
    }
}
class abstractClasss extends abstractOne {
    
    
    public void third()
    {
    System.out.println("abstractClasss-third");
    }
	public static void main (String[] args) {
		abstractClasss g= new abstractClasss();
	g.first();
	g.second();
	g.third();
	  
	}
}
 
