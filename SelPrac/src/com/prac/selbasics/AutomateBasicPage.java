package com.prac.selbasics;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Demo
{
	WebDriver drv;
	Long strt,end;
	java.util.List<WebElement> allElements;
	String City;
	int flag;
	
	public void initialize () throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\DriversRepoistory\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();	
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		strt= System.nanoTime();
		drv.get("https://www.youtube.com/");
		end=System.nanoTime();
		System.out.println("time Taken" + (strt-end));
		drv.manage().window().maximize();
		
		WebDriverWait wdw = new WebDriverWait(drv, 30);
		wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='yt-uix-button-icon yt-uix-button-icon-appbar-guide yt-sprite']")));
		WebElement upload_ = drv.findElement(By.xpath("//*[@class='yt-uix-button-icon yt-uix-button-icon-appbar-guide yt-sprite']"));
		upload_.click();
		
		end=System.nanoTime();
		System.out.println("time Taken1" + (strt-end));
		System.out.println("click on -- has been successful");
		
		WebElement upload = drv.findElement(By.xpath("//a[@href='/feed/trending']"));
		boolean prsnt = upload.isDisplayed() ;
		try {
			Assert.assertEquals(true, prsnt);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(prsnt+"This means page not loaded");
		}
		System.out.println(prsnt+"This means page loaded");
		upload.click();
		Thread.sleep(1000);
		try{
			Assert.assertEquals(drv.getTitle(),"Trending - YouTube");
		}
		catch(Exception e) {
			// TODO: handle exception
			System.out.println("This means title not matched");
		}
		System.out.println("This means title  matched");
	}
	
	public Demo()
	{
		System.out.println("JMJK Welcome");
		flag=0;
	}
	
	public void AutoSugSelect(String city) 
	{
		 System.out.println("Size is "+ allElements.size());
		
		 for (WebElement element : allElements) 
		    {
		          if ((element.getText().toLowerCase().contains(city))) 
		          {
		        	  System.out.println(element.getText() + " Got selected");
		        	  element.click();
		        	  flag=1;
		        	  break;
		          }
		    }
		 if (flag == 0) 
		 {
			 System.out.println("No match found for City");
			 drv.close();
		 }
	}
	
	public void StartExe() 
	{
		WebElement oneway = drv.findElement(By.xpath("//input[@id='gi_oneway_label']"));
		oneway.click();
	
		WebElement source = drv.findElement(By.xpath("//input[@id='gi_source_st']"));
		source.clear();
		source.sendKeys("de");
		
		allElements = drv.findElements(By.xpath("//*[@id='source_st']//div[@class='mainTxt clearfix']"));
		AutoSugSelect("delhi");	
	
		WebElement dest = drv.findElement(By.xpath ("//input[@id='gi_destination_st']"));
		dest.clear();
		dest.sendKeys("Che");
		
		allElements =drv.findElements(By.xpath("//*[@id='destination_st']//div[@class='mainTxt clearfix']"));
		AutoSugSelect("chennai");	
			    
		drv.findElement(By.xpath("//*[@id='start-date']")).click();
		drv.findElement(By.xpath("//*[@id='jrdp_start-calen_7_18_2016']//span")).click();
		
		drv.findElement(By.xpath("//*[@id='pax_link_common']")).click();
		drv.findElement(By.xpath("//select[@name='Adult']/option[.='3']")).click();
		
		drv.findElement(By.xpath("//*[@id='pax_link_common']")).click();
		drv.findElement(By.xpath("//*[@id='gi_class']")).click();
		
		drv.findElement(By.xpath("//*[@id='gi_class']/option[.='Business']")).click();
		
		drv.findElement(By.xpath("//*[@id='registerFareAlert']")).click();
		
		drv.findElement(By.xpath("//*[@id='gi_search_btn']")).click();
		
		drv.get("https://www.goibibo.com/#flight-searchresult/");
		Alert alert = drv.switchTo().alert();
		alert.accept();
	}
	
	public void EndExe() 
	{
		drv.quit();
		System.out.println("JMJK BYE");
	}
	
	public void checkAlert() 
	{
	    try 
	    {
	        WebDriverWait wait = new WebDriverWait(drv, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = drv.switchTo().alert();
	        alert.accept();
	    }
	    catch (Exception e) 
	    {
	        //exception handling
	    }
	}

}

public class AutomateBasicPage 
{
	public static void main(String args[]) throws InterruptedException
	{		
		Demo obj = new Demo();
		
		obj.initialize();
			
//		obj.StartExe();
//	    
//		obj.checkAlert();
//		
//		obj.EndExe();
	}
}

