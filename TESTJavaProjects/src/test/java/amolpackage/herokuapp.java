package amolpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuapp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("xyz");
		driver.findElement(By.id("password")).sendKeys("xyz");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		//driver.close();
		
		
		WebElement loginbtn=driver.findElement(By.cssSelector("button.radius[type='submit']"));

	}

}
