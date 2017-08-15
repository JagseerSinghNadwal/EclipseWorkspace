package JavaPrac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


public class readExcelnWordPOI {

	public static void main(String[] args) throws IOException 
	{
		readExcel();
		createWord();
		readWord();
	}

	public static void createWord() throws IOException 
	{
		System.out.println("-----------DOC CREATing--------");
		XWPFDocument doc = new XWPFDocument();
		OutputStream fis = new FileOutputStream("E:/My Data/JMJK/selenium/Java Workspace/JMJK/src/JavaPrac/temp.docx");
		
		XWPFParagraph para1 = doc.createParagraph();  //creates blank doc
		XWPFRun run1 = para1.createRun(); //used to add/change the text in a specified element/region.
		run1.setText("File fle = new File(E:/My Data/JMJK/selenium/Java Workspace/JMJK/src/JavaPrac/Comm.docx);lenium/Java Workspace/JMJK/src/JavaPrac/Comm.docx);" +
		"FileInputStream fis = new FileInputStream(fle); extractDoc.close();");
		run1.addBreak(); //adds new line
		run1.addBreak();
		run1.setText("XWPFWordExtractor extractDoc = new XWPFWordExtractor(docObj);"+
		"System.out.println(extractDoc.getText());");
		
		doc.write(fis);
		fis.close();
		System.out.println("-----------DOC CREATED--------");
		
	}

	public static void readWord() throws IOException 
	{
		File fle = new File("E:/My Data/JMJK/selenium/Java Workspace/JMJK/src/JavaPrac/temp.docx");
		FileInputStream fis = new FileInputStream(fle);
		XWPFDocument doc = new XWPFDocument(fis);
		XWPFWordExtractor extractDoc = new XWPFWordExtractor(doc);
		System.out.println(extractDoc.getText());
		extractDoc.close();
		fis.close();
	}

	static void readExcel() throws IOException
	{
			File fle = new File("E:\\My Data\\JMJK\\selenium\\Java Workspace\\JMJK\\src\\JavaPrac\\PDatasheet.xlsx");
			FileInputStream fis = new FileInputStream(fle);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Login");
			DataFormatter formatter = new DataFormatter();
			
			//read single cell value
			System.out.println("Single value read is : "+formatter.formatCellValue(sh.getRow(1).getCell(4)));
			
			//read multiple lines
			int rowCount = sh.getLastRowNum();
			XSSFRow row;
			XSSFCell cell;
			
			for (int i = 0; i <rowCount; i++)
			{ 
				row = sh.getRow(i);
				for (int j=0; j<row.getLastCellNum(); j++)
				{
					cell = row.getCell(j);
					System.out.print("  "+ getCellValue(cell));
					
					/*cell = sh.getRow(i).getCell(j);		//can use this way also
					if(cell.getCellType() == cell.CELL_TYPE_NUMERIC) 		//not used now as Dataformater is available 
					{
						System.out.print("  "+cell.getNumericCellValue());
					}
					else if (cell.getCellType() == cell.CELL_TYPE_STRING)
					{
						System.out.print("  "+cell.getStringCellValue());
					}*/
				}
				System.out.println("");
			}
			wb.close();
	}
	
	static String getCellValue(XSSFCell cell)
	{
		String strCell;
		DataFormatter formatter = new DataFormatter();
		strCell = formatter.formatCellValue(cell);
		return strCell;
	}
}
