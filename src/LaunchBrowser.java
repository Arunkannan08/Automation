
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To Open the web page 
		driver.get("https://demoqa.com/text-box");
		
		//Find Webelement using Locator id 
		WebElement name = driver.findElement(By.id("userName"));
		
		//Add Value to name attribute 
		name.sendKeys("Arun");
		
		//Find Web Element using basic xpath 
		WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
		emailId.sendKeys("Test123@gmail.com");
		
		//Find Web element using link text 
		//WebElement submitBtn = driver.findElement(By.linkText("Submit"));
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		Thread.sleep(2000);
		//Click the button 
		submitBtn.click();
	}

}
