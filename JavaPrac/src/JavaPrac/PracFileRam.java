package JavaPrac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracFileRam {

	public static void main(String[] args) throws IOException 
	{
		File fle = new File("E:\\My Data\\JMJK\\selenium\\Java Workspace\\misc\\Sample.txt");
		FileReader fr = new FileReader(fle);
		
		BufferedReader br = new BufferedReader(fr);
		String strLine,str1 ;
		
		while ((strLine = br.readLine())!= null)
		{
			if (strLine.substring(0,2).equals("02"))
			{
				System.out.println(strLine);
				System.out.println(strLine.concat("sdf").contains("sdf"));
				//System.out.println(strLine.substring(4, 10));
			}
			
		}	
		fr.reset();
		//	
		//asdsa
		//ds
		int i;
		while ((i = fr.read()) != -1 )
		{
			System.out.println((char)i);
		}
		
		
	br.close();
	fr.close();
	}

}
