package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyAccountTestPage 
{
  @Test
  public void f() throws Exception 
  {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\DriversRepoistory\\chromedriver_win32\\chromedriver_2.exe");
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://mail.cognizant.com");
	System.out.println("JMJK");
	Thread.sleep(1000);
	wd.close();
  }
}
