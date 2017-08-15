package com.prac.selbasics;
/*package PracSel;
		//org.junit.Assert.assertTrue("Verify if the Go Ibibo page is displayed", driver.findElement(By.id("gi_source")).isDisplayed());
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.id("gi_source_st")).clear();
		driver.findElement(By.id("gi_source_st")).sendKeys("De");
		Thread.sleep(1500);
		driver.findElement(By.id("gi_source_st")).sendKeys(Keys.ARROW_DOWN);
		String Name = driver.findElement(By.id("gi_source_st")).getAttribute("value").trim();
		
		while(!Name.contains("Denver"))	
		{
			driver.findElement(By.id("gi_source_st")).sendKeys(Keys.ARROW_DOWN);
			Name = driver.findElement(By.id("gi_source_st")).getAttribute("value").trim();
		}
		driver.findElement(By.id("gi_source_st")).sendKeys(Keys.ENTER);
		
		String Displayed = driver.findElement(By.xpath("//*[@id='gi_search_btn']")).getCssValue("background");
		String Expected = "rgb(242, 103, 34)";
		
		org.junit.Assert.assertEquals("Verify if the Color is Orange!!", true, Displayed.contains(Expected));
//		driver.findElement(By.id("LastName")).sendKeys("Kaneria");
//		driver.findElement(By.id("GmailAddress")).sendKeys("kaneriasmriti8827749643");
//		driver.findElement(By.id("Passwd")).sendKeys("Smriti.Kaneria@2017");
//		driver.findElement(By.id("PasswdAgain")).sendKeys("Smriti.Kaneria@2017");
//		new Actions(driver).clickAndHold(driver.findElement(By.xpath("//label[@id='month-label']"))).build().perform();
//		//driver.findElement(By.xpath("//label[@id='month-label']")).click();
//		
//	
//		
//		List <WebElement> Months = driver.findElements(By.xpath("//div[@class='goog-menu goog-menu-vertical']/div/div"));
//        
//        int size=Months.size();
//           for (int i=1;i<=size;i++)
//        {
//       	 String Name = driver.findElement(By.xpath("(//div[@class='goog-menu goog-menu-vertical']/div/div)["+i+"]")).getText().trim();
//           if(Name.equals("May"))
//           {
//        	   driver.findElement(By.xpath("(//div[@class='goog-menu goog-menu-vertical']/div/div)["+i+"]")).click();
//           }
//
//      
//       
//       	 ************************************************************


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.sun.jna.Structure.FFIType.size_t;

public class signup_Google_chrome {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\"+"chromedriver.exe"); 
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		WebElement drag =  driver.findElement(By.id("draggable"));
		WebElement drop =  driver.findElement(By.id("droppable"));
		new Actions(driver).dragAndDrop(drag, drop).build().perform();
       	driver.switchTo().defaultContent();
        }
}

*/


 





