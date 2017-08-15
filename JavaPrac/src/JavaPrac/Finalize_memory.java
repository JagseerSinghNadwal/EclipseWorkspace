package JavaPrac;
/**
 * @author Jagseer singh Nadwal
 * @version 2.1.3
 */
public class Finalize_memory {
	/**Jagseer singh
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	public void finalize(){
		 Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  System.out.println("object is garbage collected");}
	/** java main fun
	 * HEllo Jmjk
	 * @
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub	
		  
		Runtime r=Runtime.getRuntime();    
		  new Finalize_memory();
		  System.out.println("After creating instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
		  System.out.println("JMJK");

	}

}
