package mavenpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	
	
	static WebDriver driver = null;
	
	@Test
	
	public static void login() {
		
		
		String URL= "https://www.amazon.in/";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\imp\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9851222681");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kolkata@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Actions actions = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		actions.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
		driver.close();
	}

}
