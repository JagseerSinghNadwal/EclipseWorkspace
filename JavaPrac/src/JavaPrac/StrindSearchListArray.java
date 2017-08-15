package JavaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class StrindSearchListArray {

	public static void main(String[] args) 
	{
		String st,str = "jasgs";
		System.out.println("Initail String : "+str);
		st = str+"singh";
		str = "nads";
		System.out.println(" String after appended : " + st + "\n String reassigned to : "+str);
		
		StringBuilder sb= new StringBuilder("nadwal");
		sb = sb.append("jasg");
		System.out.println("UsedString builder : "+sb);
		
		//How to find a whole word in a String in java
		String string = "I will come and meet you at the 123woods Jagseer Singh Nadwal Nadwal";
		String keyword = "123woods";

		Boolean found1 = Arrays.asList(string.split(" ")).contains(keyword);  //used contains here as Arrays.aslist returns list
		if(found1){
		      System.out.println("Keyword matched the string "+keyword);
		}
		
		//String array to Arrays.Tostring  (String.tostring Doesn't give string)
		String[] tokenString = {"Jagseer","Singh","Nadwal"}; 
		String strg = Arrays.toString(tokenString);
		System.out.println("String array to Arrays.Tostring : [Before]"+ tokenString +" [After] : " + strg);
		
		//Arrays.aslist returns list and works for object types only
		List<String> lsStr = Arrays.asList(string.split(" ")); //OR
		HashSet<String> lsStrSetDirect = new HashSet<String>(Arrays.asList(new String[] {"a","b","c"} )); 
		System.out.println("From hashset traverse:"+ lsStrSetDirect);
		
		System.out.print("From foreach List traverse:");
		for ( String ls: lsStr)
		{
			System.out.print(ls+ " ");
		}
		System.out.println("\nFrom List traverse ToString :"+lsStr.toString());
	
		//Check collection contains collection
		List<String> lsA = new ArrayList<String>();
		lsA.add("Jagseer");
		lsA.add("Singh");
		lsA.add("Nadwal");
		System.out.println("Check collection contians collection : "+lsStr.containsAll(lsA));
		
		//Check collection contains String[]
		System.out.println("Check collection contains String[] :"+lsA.containsAll(((Arrays.asList(tokenString)))));
		
		//Check String contains String
		System.out.println("Check String contains String :"+string.contains("Jagseer"));
		
		//Split fun
		String string2 = "I will come and meet you at the 123woods";
		String sTemp = "";
		String[] strng =  string2.split(" ");
		System.out.print("String joined after splitted using Split : ");
		for (String st1 : strng)
		{
			sTemp = sTemp + " " + st1;
		}
		System.out.println(sTemp);
		
		
		// using Regex and pattern class
		/*String text = "I will come and meet you at the woods 123woods and all the woods";
		List<String> tokens = new ArrayList<String>();
		tokens.add("123woods");
		tokens.add("woods");

		String patternString = "\\b(" + StringUtils.join(tokens, "|") + ")\\b"; install Utils
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
		    System.out.println(matcher.group(1));
		}*/
	
		System.out.println("\n-------------String Funcitons--------------\n");
		
		//== tests for reference equality (whether they are the same object).
		//.equals() tests for value equality (whether they are logically "equal").
		
		String s1 = "Jagseer";
		String s1_1 = s1;
		String s2 = new String("Jagseer");
		String s2_1 = new String("Jagseer");
		String s3 = new String("JagseerSIngh");
		
		System.out.println("s3.substring(1,3) : " +s3.substring(1,3)); 
		System.out.println("s1.substring(1,7) : " +s1.substring(1,7));  //beginIndex - inclusive. & endIndex - exclusive. 

		System.out.println("s1.charAt(0) :" + s1.charAt(0)+ " " + "s3.charAt(1) :" +s3.charAt(1));
		System.out.println( s1.charAt(0) > +s3.charAt(1)); //returns false
		System.out.println("s1.compareTo(s2) :" +s1.compareTo(s2));
		
		System.out.println("s1: "+s1.length() +", s3: "+ + s3.length());
		
		System.out.println("s1.compareTo(s3) :" +s1.compareTo(s3));  	//returns -5
		System.out.println("s3.compareTo(s1) :" +s3.compareTo(s1));        // returns int value < 0 < so here //returns 5
		System.out.println("s1.contentEquals(s2) :"+s1.contentEquals(s2));  //returns true and false
		System.out.println(s2.equals(s1));
		
		System.out.print("s1 = s3 :" );		System.out.println(s1 = s3);
		
		System.out.println("s1.equals(s1_1): "+s1.equals(s1_1));  //returns false as both are not objects
		System.out.println("Objects.equals(s1, s1_1) :" + Objects.equals(s1, s1_1));
		System.out.println("s2.equals(s2_1): "+s2.equals(s2_1));  // compares 2 objects and returns true
		System.out.println("s2 == s2_1 : "+s2 == s2_1);	// compares string references and returns false
		System.out.println("s2"== "s2");  //only direct string compares and returns true
		System.out.println("s1.equals(s2): "+s1.equals(s2));	//returns false as comparing String variable and object
				
		String ss1 = new String("SAM");
		String ss2 = new String(ss1);
		System.out.println("ss1 == ss2: "+ss1 == ss2);
		System.out.println(ss1.contentEquals(ss2));
		
		String test = "a1b2c3";
		String test1 = "a1b2c3";
		String[] strs = test.split("\\d");
		for (String s :strs)
		{
			System.out.print(" " +s);
		}
		System.out.println();
		StringBuffer stb = new StringBuffer("a1b2c3");
		StringBuffer stb1 = new StringBuffer("a1b2c3");
		System.out.println(stb.equals(test)+"," + test.equals(stb)); //false - Mix
		System.out.println(test.equals(test1)+"," + test1.equals(test)); //true - Strings
		System.out.println(stb.equals(stb1)+"," + stb1.equals(stb)); //false - stringBuffer
		
		/*String sNull = null;   
		if (sNull.length() == 0)	//run time exception "NullPointerException"
		{
			System.out.println("1");
		}
		else if (sNull  == null) //this works fine
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("3");
		}*/
	}

}
