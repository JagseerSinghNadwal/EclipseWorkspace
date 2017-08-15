package JavaPrac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MultiThreadingFiles 
{
	private static BufferedWriter br;

	private static void writeToFile(File fp, String str) {
		// TODO Auto-generated method stub
		try {
			br = new BufferedWriter(new FileWriter(fp));
			br.write(str);
			br.write("written");
			br.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		long startTime = System.nanoTime();
		File dir = new File("C:\\");
		File dest = new File("C:\\Users\\Jagseer\\Downloads\\test.txt");
		
		File[] files = dir.listFiles();
		
		for (File f: files)
		{
			String str= f.getAbsolutePath();
			System.out.println(str + f);
			writeToFile(dest,str);
		}
		
		System.out.println("end");
		long endTime = System.nanoTime();
		
		long totalTime = endTime-startTime;
		System.out.print(startTime + "  "+ endTime+ " = "+ totalTime);
	}
	
}		
	
