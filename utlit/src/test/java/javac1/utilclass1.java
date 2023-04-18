package javac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilclass1 extends java_codes
{
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	WebDriver driver;
		@BeforeTest
		public void bt()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		@Test
		public void tc() throws InterruptedException
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(3000);
			WebElement submit= driver.findElement(By.xpath("//*[@type='submit']"));
			Thread.sleep(3000);
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].scrollIntoView(true);", submit);
			 
			 JavascriptExecutor js1= ((JavascriptExecutor)driver);
		        js.executeScript("arguments[0].style.border = '3px solid red '", submit);
		        
		        JavascriptExecutor js2= ((JavascriptExecutor)driver);
		        js.executeScript("arguments[0].click();", submit);
		        
		        JavascriptExecutor js3= ((JavascriptExecutor)driver);
		        js.executeScript("history.go(0)");
		        
		       WebElement AD=driver.findElement(By.linkText("Admin"));
		        JavascriptExecutor js4= ((JavascriptExecutor)driver);
		       
		        js.executeScript("arguments[0].style.backgroundColor = '" + "blue" + "'",  AD);
		        
		        try {
		            Thread.sleep(3000);
		        }catch(InterruptedException e) {
		            
		        }
		        
		        WebElement AD1=driver.findElement(By.linkText("Recruitment"));
		        String bgcolor= AD1.getCssValue("backgroundColor");//gives the background color of the element
		        
		        for(int i=0; i<500; i++) {  // change the background color multiple times
		            changeColor("#000000",AD1,driver);  //#000000 -> This represent black
		            changeColor(bgcolor,AD1,driver);  // change to it's original color
		            
		        }
		        
		        
		        
		        
		}
}
