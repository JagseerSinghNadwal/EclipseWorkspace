package JavaPrac;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class DatePrac {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		GregorianCalendar grc= new GregorianCalendar();
		
		char c= 'n';
		Character c1 = new Character('k');
		System.out.println(grc.get(Calendar.DATE)+"  "+grc.get(Calendar.DAY_OF_MONTH)+ " "+c+" "+c1);
		
		String duplicates[] = new String[]{"java","php","javascript","php","java","jmeter"};
		  Set nonDuplicateSet = new HashSet<>();
		  Set DuplicateSet = new HashSet<>();
		  
		  for(String string : duplicates)
		  {
		   if(!nonDuplicateSet.contains(string))
		   {
		    nonDuplicateSet.add(string);
		   }
		   else
		   {
		    DuplicateSet.add(string);
		   }
		   
		   
		  }
		  System.out.println("Duplicate Values is = "+DuplicateSet);
		  System.out.println("NonDuplicate Values is = "+nonDuplicateSet);
		 }
	
	}
