package com.prac.selbasics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotandAutoIT {

	public static void main(String[] args) throws IOException, Exception 
	{
		//upload file using AutoIT
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\DriversRepoistory\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement we = driver.findElement(By.xpath("//*[@class='input-file']"));
		
		we.click();
		Runtime.getRuntime().exec("E:\\Selenium\\EclipseWorkspace\\SelPrac\\src\\com\\prac\\selbasics\\OpenPopUpHandle.exe");
		Thread.sleep(1000);
		
		//pass credentials using Robot
		/*Robot r = new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagseer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.engprod-charter.net/");
		StringSelection uname = new StringSelection("Jags");
		StringSelection pass = new StringSelection("pass");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uname, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);	
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pass, null);
		r.keyPress(KeyEvent.VK_CONTROL);	
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close(); 
*/
		}

}
