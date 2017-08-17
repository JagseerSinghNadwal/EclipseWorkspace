package JavaPrac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Scanner;

/**
 * @author Jagseer
 * Major Differences :
FileWriter throws IOException in case of any IO failure.
None of the PrintWriter methods throws IOException, instead they set a boolean flag which can be obtained using checkError().
PrintWriter automatically invokes flush after every byte of data is written. In case of FileWriter, caller has to take care of invoking flush.
 */
public class FileRead {

	public static void main(String[] args) throws Exception 
	{
		//File readwrite first word
	//Using Filetwriter+Scanner
		File fleO = new File("E:\\Selenium\\EclipseWorkspace\\SelPrac\\src\\com\\prac\\selbasics\\AutiITFileWriter.txt");
		File fleI = new File("E:\\Selenium\\EclipseWorkspace\\SelPrac\\src\\com\\prac\\selbasics\\AutoIt.txt");
		Scanner sc = new Scanner(fleI);
		FileWriter fw = new FileWriter(fleO); 
		while (sc.hasNextLine())
		{
			String tempStr = sc.next();
			System.out.println(tempStr);	
			fw.write(tempStr);   //write
			sc.nextLine();
		}
		fw.close();
		sc.close();
		
	//Using Printwriter  and FileReader+BufferReader
				String fleOp = new String("E:\\Selenium\\EclipseWorkspace\\SelPrac\\src\\com\\prac\\selbasics\\AutiITPrintWriter.txt");
				String strLine, tempStr;
				FileReader fr = new FileReader(fleI);
				BufferedReader br = new BufferedReader(fr);
		        PrintWriter pw =new PrintWriter(fleOp); //methods work fine with File/String Object
				System.out.println("______________________________");
				while ((strLine = br.readLine())!= null)
				{
					System.out.println(strLine);
					pw.println(strLine);  //println
				}
				pw.close();
				
				//Check file is opened or not
				File fl = new File(fleOp);
				FileChannel fc =new RandomAccessFile(fl, "rw").getChannel();
				FileLock flk = fc.lock();
				try 
				{
					flk = fc.tryLock();
					System.out.println("trying to get lock of file");
				}
				catch(Exception e)
				{
					System.out.println("File already locked means opened");
				}
				finally 
				{
					flk.release();
					fc.close();
				}
		}

}
