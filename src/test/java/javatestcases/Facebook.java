package javatestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Mahika\\eclipse-workspace\\Jenkinsproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//WebElement createacc = driver.findElement(By.xpath("//a[@role ='button' and @ajaxify='/reg/spotlight/']"));
		WebElement create = driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']"));
		
		create.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name ='firstname']"));
		
		fname.clear();
		fname.sendKeys("Keerthana");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Madhu");
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("5867867321");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pass.sendKeys("mahishana123");
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sc.selectByVisibleText("Nov");
		Select scday = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		scday.selectByVisibleText("13");
		Select scyear = new Select(driver.findElement(By.id("year")));
		scyear.selectByVisibleText("1983");
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		radio.click();
		WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		signup.click();
		

		

	}

}
