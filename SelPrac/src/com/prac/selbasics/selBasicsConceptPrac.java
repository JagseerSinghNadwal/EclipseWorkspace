package com.prac.selbasics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import junit.framework.Assert;

public class selBasicsConceptPrac {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		// TODO Auto-generated method stub
		WebDriver drv,drv1;
		Long strt,end;
			
		//capabiltiies
		System.setProperty("webdriver.chrome.driver","E:\\My Data\\JMJK\\selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();	
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 	
		strt= System.nanoTime();
		//username and password 
		drv.get("https://499527:Cogniz@12&@3www.google.com/");  
		drv.get("https://www.youtube.com/");
		end=System.nanoTime();
		System.out.println("time Taken" + (strt-end));
		drv.manage().window().maximize(); 
		
		//implicit wait
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//explicit wait
		Thread.sleep(100);
		
		WebDriverWait wdw = new WebDriverWait(drv, 15);
		wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='yt-uix-button-icon yt-uix-button-icon-material-upload yt-sprite']")));
				
		//get title of webpage
		String ttl1 = drv.getTitle();
				
		//refresh or get current URL
		drv.getCurrentUrl();
		drv.navigate().to("https://www.youtube.com/");
				
		//Navigate back
		drv.navigate().back();
		System.out.println("back from youtube home");
		drv.findElements(By.tagName("a"));  // will find all them links  
		drv.findElement(By.cssSelector("input#id.classname"));  
		
		//Screenshot
		File snpsht = ((TakesScreenshot)drv).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snpsht, new File("C:\\h.jpg"));
		
		//Navigate frwd
			drv.navigate().forward();
			System.out.println("again on youtube home");
			
		//javascript
		JavascriptExecutor jse = (JavascriptExecutor)drv;
		String str = "Document.getElementsByID('ID').SetAttribute('Disabled')";
		jse.executeScript(str);
		
		String CurrentURLUsingJS=(String)jse.executeScript("return document.domain");
		CurrentURLUsingJS.length();
		
		jse.executeScript("alert('Test Case Execution Is started Now..');");
				
		drv.navigate().to("javascript:document.getElementByID('Overridelink').click()");
		
		// to get all link lists
		List<WebElement> ls = drv.findElements(By.tagName("a")); 
		for(WebElement we:ls)
		{
			System.out.println(we);
		}
		
		//element status check
		WebElement upload = drv.findElement(By.xpath("//*[@class='yt-uix-button-icon yt-uix-button-icon-material-upload yt-sprite']"));
		upload.isDisplayed();
		upload.isEnabled();
		
		//check box selected or not.
		if(!upload.isSelected())
		{
			upload.click();
		}
		
		if(upload.getAttribute("checked") != null)
		{
			upload.click();
		}
		
		upload.clear();
		
		//Webtable - find further from web element  (e.g. in case of table row then access cell values)
		WebElement htmltable = drv.findElement(By.xpath(("//*[@id='main']/table[1]/tbody")));
		List<WebElement> tRow = htmltable.findElements(By.tagName("tr"));
		for (WebElement row: tRow)
		{
			List<WebElement> tCol = row.findElements(By.tagName("td"));
			for(WebElement col : tCol)
			{
				String cellValue = col.getText();
			} 
		}
		
		//to get ID of thread
		Thread.currentThread().getId();  //useful in testNG 
		
		//server start and stop
		SeleniumServer ss= new SeleniumServer(null);
		ss.stop();
		
		//frames
		drv.switchTo().frame("Book");
		drv.switchTo().frame(0);
		drv.switchTo().frame(upload);
		drv.switchTo().defaultContent();  //most parent
		drv.switchTo().parentFrame();  //parent
		
		//Alert or window pop ups  
		Alert alrt = drv.switchTo().alert();
		alrt.accept();
		alrt.dismiss();
		alrt.getText();
		//Will pass the text to the prompt popup
		alrt.sendKeys("Hello Alert");  
		
		//first - Is used to Authenticate by passing the credentials
		alrt.authenticateUsing(new UserAndPassword("jagseer", "singh"));
		//to wait for alert to appear
		Alert alrt1 = wdw.until(ExpectedConditions.alertIsPresent());  
		
		//second - handle authentication /credentials pop up using .get()
		drv.get("http://UserName:Password@Example.com");
		
		//third - other way--yet to verify
		alrt.sendKeys("password"+Keys.TAB+"singh");		
		
		//main window
		String mainWindow = drv.getWindowHandle();
		//to handle multiple window  -- close all child windows
		Set<String> wh = drv.getWindowHandles();
		for(String whs:wh)
		{
			if (!whs.equalsIgnoreCase(mainWindow))
			{
				drv.switchTo().window(whs);
				drv.close();	
			}
		}
		drv.switchTo().window(mainWindow);
		
		//other method
		String prnt = null,chld[] = null;
		Set<String> awh = drv.getWindowHandles();
		for (int i=0; i<str.length(); i++)
		{
			if (i==0)
			{
				prnt = (String) awh.toArray()[i];  //parent windoe
				//String prnt = (String) awh.toArray()[0];
			}
			else
			{
				chld[i] = (String) awh.toArray()[i];  //child windows
				//String chld1 = (String) awh.toArray()[1];
			} }
		drv.switchTo().window(chld[1]);
		drv.switchTo().window(prnt);
		
		//get adress of window or browser
				for (String str1:drv.getWindowHandles())
				System.out.println(str1);
				
		//secure certificate issue fix in firefox
		FirefoxProfile ffp = new FirefoxProfile();
		ffp.setAcceptUntrustedCertificates(true);
		ffp.setAssumeUntrustedCertificateIssuer(true);
		drv1 = new FirefoxDriver(ffp);
		
		//secure certificate issue fix in IE
		drv1.navigate().to("javascript:document.getElementByID('Overridelink').click()");
		
		//htmlunitdriver 
		HtmlUnitDriver hud = new HtmlUnitDriver();
		hud.get("http://www.google.com/");
		
			//ways of sending enter
			upload.sendKeys(Keys.ENTER);  
			new Actions(drv).sendKeys(Keys.TAB);   //Action class for TAB
			upload.click();
			upload.submit();
			
			//upload file using send keys
			WebElement fileInput = drv.findElement(By.name("uploadfile"));
			fileInput.sendKeys("C:/path/to/file.jpg");
			
			//using autoIT
			Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
			
			//Robot class
			Robot rb = new Robot();
			//keyboard
			rb.keyPress(KeyEvent.VK_CAPS_LOCK);
			rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
			//mouse
			rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rb.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			rb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			rb.mouseMove(12, 12);
			rb.mouseWheel(3);
			rb.getPixelColor((int)MouseInfo.getPointerInfo().getLocation().getX(),(int)MouseInfo.getPointerInfo().getLocation().getY());
			rb.delay(1000);
			
			MouseInfo.getNumberOfButtons(); // get number of mouse buttons
			MouseInfo.getPointerInfo().getLocation().getX(); // gives current mouse location
			Toolkit.getDefaultToolkit().getScreenResolution(); //gives screenresolution
			
			//Action Class
			Actions act = new Actions(drv);
			//no need of using Build() when performing single action only
			act.moveToElement(upload).perform();
			//use action to store the compiled actions as one
			Action acti1 = act.moveToElement(upload).keyDown(Keys.ALT).build();
			acti1.perform();
			//use actions to store the mutilple without building as one action
			Actions acti2 = act.moveToElement(upload).keyDown(Keys.ALT);
			acti2.build().perform();
			//all functions for mouse
			act.click();
			act.clickAndHold();
			act.contextClick();
			act.doubleClick();
			act.dragAndDrop(upload, upload);
			act.release();
			act.moveByOffset(2, 2);
			act.moveToElement(upload);
			//all functions for keyboard
			act.sendKeys(Keys.CLEAR);
			act.sendKeys(upload, Keys.ENTER); 	
			act.keyDown(Keys.ENTER);
			act.keyUp(Keys.ENTER);
			act.wait(10);
			
			//Select from dropdown
			Select sl= new Select(drv.findElement(By.xpath(".//*[@id='Infants']")));
			sl.selectByIndex(1);
			sl.selectByValue("jags");
			sl.selectByVisibleText("sdf");
			List<WebElement> optns = sl.getOptions(); //to get all options
			for(WebElement age:optns)
			{
			System.out.println(age.getText()); 
			System.out.println(age.getAttribute("value")); 
			}
			String gfv = sl.getFirstSelectedOption().getText();  //return first selected option in selected tag
			List<WebElement> asv = sl.getAllSelectedOptions();  //List of All selected options belonging to this select tag
			for(WebElement age:asv)
			{
			System.out.println(age.getText()); 
			System.out.println(age.getAttribute("value")); 
			}
			sl.deselectAll();   //deselect all
			sl.deselectByIndex(1);
			sl.deselectByValue("a");
			sl.deselectByVisibleText("as");
			
			// launch a batch file
			Process prcbtch = Runtime.getRuntime().exec("E:\\My Data\\JMJK\\selenium\\Drivers\\eclipse-standard-mars-M1-win32-x86_64\\eclipse\\eclipse.exe");
			prcbtch.waitFor();
			
			// close browser 
			drv.close(); //close current instance with focus
			drv.quit(); // all instances   - calls drv.dispose() fun
			
			//get class name
			ITestResult itr = null  ;
			itr.getInstanceName();
			
			//setting proxy
			Proxy px = new Proxy();
			px.setHttpProxy("localhost:7777");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(CapabilityType.PROXY,px);
			drv = new FirefoxDriver(dc);
			
			//Assert/Verify
			//Verify --Verify Text Present  // Assert without Try Catch/If-else
			if (drv.getPageSource().contains("jagseer"))
			{
				System.out.println("yes present");
			}
			//OR
			try{
			assertTrue(drv.findElement(By.cssSelector("Body")).getText().matches("^[\\s\\S]")); //OR
			assertTrue(drv.findElement(By.id("if")).getText().matches("jags"));    //OR
			assertEquals("jasgs", drv.findElement(By.id("if")).getText());
			}
			catch(Error e)
			{
				System.out.println(e.getStackTrace());
			}
			//Verify --Verify Element Present  // Assert without Try Catch/If-else
			Assert.assertEquals(0, drv.findElements(By.id("locator")).size());
		}	

}	
