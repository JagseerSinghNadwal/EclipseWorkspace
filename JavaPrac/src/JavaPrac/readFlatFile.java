package JavaPrac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFlatFile {

	public static void main(String[] args) throws IOException 
	{
		int flag=0;
		File fle = new File("E:\\My Data\\JMJK\\selenium\\Java Workspace\\SelPrac\\src\\PracSel\\AutoIt.txt");
		FileReader fr = new FileReader(fle);
		BufferedReader br = new BufferedReader(fr);
		String strLine;
		 
		while ((strLine = br.readLine())!= null)
		{
			if (strLine.substring(0,2).equals("02"))
			{
				System.out.println(strLine);
				System.out.println(strLine.substring(4, 10));
				flag=1;
			}
		}	
		
		if(flag == 0)
		{
			System.out.println("No match found in file");
		}
	br.close();
	fr.close();
	}

}
