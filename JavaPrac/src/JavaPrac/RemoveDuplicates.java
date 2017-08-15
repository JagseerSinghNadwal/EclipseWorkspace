package JavaPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
 
	public static int[] removeDuplicates(int[] input)
	{		
		int op[] = new int[input.length],j=0;
		
		for (int ary:input)
		{
		    //changed int[] to Integer[] to check contains as arrays.contains doesn't work for arrays of primitives 
		    if(!Arrays.asList(Arrays.stream( op ).boxed().toArray( Integer[]::new )).contains(ary))  
		    {
		        op[j++] = ary;
		    }
		}
	//copy the array to new array
    	return Arrays.copyOf(op,j);   
	}
	
	public static int[] unq(int[] i)
	{
	    //convert the int[] to Set -- as Set only accepts the unique
	    Set<Integer> s= new HashSet<Integer>();

	    for(int a : i)
	    {
	          s.add(a);
	    }
	    
	    Integer[] optemp = s.toArray(new Integer[s.size()]);  //convert from Set to arrays
	    int[] intArray = Arrays.stream(optemp).mapToInt(Integer::intValue).toArray();  //Convert from Interger[] to int[]
	    
	   return intArray;
	}
	
	public static void main(String a[]){
		int[] input1 = {1,1,2,3,1,3,5,2};//{2,2,3,6,6,8,9,10,10,10,12,12};
		int[] output = removeDuplicates(input1);
		
		System.out.print("Using foreach with Arrays.contains :-  ");
		for(int i:output)
		{
			System.out.print(i+" ");
		}
		System.out.print("\nUsing Set :-  ");
		
		int[] unqu = unq(input1);
		for(int i:unqu){
			System.out.print(i+" ");
		}
	}
}




