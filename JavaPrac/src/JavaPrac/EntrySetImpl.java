package JavaPrac;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class EntrySetImpl {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  String original = "I aaaaaaaaaaaam working as Computer Engineer";
  Duplicate(original);
 }
  
  public static void Duplicate(String str) 
  {
   Map<Character,Integer> map = new HashMap<>();
   char[] characters = str.toCharArray();
   
   for(char c : characters )
   {
    if(!map.containsKey(c))
    {
     map.put(c, 1 );
    }
    else
    {
     map.put(c, map.get(c)+1);
    }
     
    
   }

   System.out.println("Map :-"+map);
   System.out.println("JMJK- MyDefined");
      String[] s= map.toString().split(",");
  for (String str1:s)
  {
	  int i;
	  if (str1.endsWith("}"))
		  i = Integer.parseInt(str1.substring(3,str1.indexOf('}')));
	  else
		  i = Integer.parseInt(str1.substring(3));  
	  
	  if (i > 1)
	  System.out.println(str1.charAt(1)+" : " + i);
	 
  }

  System.out.println("JMJK- Iterator-Generic/Default-NonGenerixWithIterator");
  Set<?> entrys  = map.entrySet();
  Iterator<?> it = entrys.iterator();
  while(it.hasNext()) 
  {
      @SuppressWarnings("unchecked")
	Map.Entry<Character, Integer> me = (Entry<Character, Integer>)it.next();  //if we dont add type args in refernce then 
																//it shows error of invalid operator in next line
      if (me.getValue() > 1)
      {
    	  System.out.print(me.getKey() + ": ");
    	  System.out.println(me.getValue());
      }
   }
  
  System.out.println("JMJK- typeargsSpecific-Best-forloop");
    // Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
   for(Map.Entry<Character, Integer> entry : map.entrySet())
   {
   if(entry.getValue()>1)
   System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
   }
   
  }

 }