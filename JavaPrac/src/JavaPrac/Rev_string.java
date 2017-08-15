package JavaPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Rev_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Jagseer";
StringBuilder sb = new StringBuilder();
sb.append(str);
sb = sb.reverse();    

System.out.println(sb);
System.out.println(str);	

//other
String original, reverse = "";
Scanner in = new Scanner(System.in);

System.out.println("Enter a string to reverse");
original = in.nextLine();

int length = original.length();

for ( int i = length - 1 ; i >= 0 ; i-- )
   reverse = reverse + original.charAt(i);
System.out.println("Reverse of entered string is: "+reverse);
	}
}
   