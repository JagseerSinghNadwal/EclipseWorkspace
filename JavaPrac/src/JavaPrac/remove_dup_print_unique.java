package JavaPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_dup_print_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("jagseer");
Integer ar[] = {5,2,7,2,4,7,8,2,3,1,5};
Set<Integer> sett = new HashSet<Integer>(Arrays.asList(ar)); 

System.out.println(sett);

int[] arr = {5,2,7,2,4,7,8,2,3};

for(int i=0;i<arr.length;i++)
{
    boolean isDistinct = false;
    for(int j=0;j<i;j++)
    {
        if(arr[i] == arr[j])
        {
            isDistinct = true;
            break;
        }
    }
    if(!isDistinct)
    {
        System.out.print(arr[i]+" ");
    }

}
	}
}
   