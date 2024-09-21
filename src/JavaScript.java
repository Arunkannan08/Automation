import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Document;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//JavaScript Executor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)"); //To Scroll Down 
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)"); //To scroll up 
		String title = js.executeScript("return document.title").toString(); //to get tab title 
		System.out.println("Title is : "+title);
		String url =js.executeScript("return document.URL").toString();//to get title 
		System.out.println(url);
		js.executeScript("document.getElementById('twotabsearchtextbox').value='Iphone'"); //to send keys 
		js.executeScript("arguments[0].scrollIntoView();",aboutUs);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",aboutUs);//click on particular element 
		
		
		driver.quit();
		
	}

}
