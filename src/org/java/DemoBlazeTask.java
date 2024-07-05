package org.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DemoBlazeTask {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement log = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		log.click();
		WebElement user = driver.findElement(By.xpath("//input[@id='loginusername']"));
		user.sendKeys("dharanikrishnan123");
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("dharanipooja");
		WebElement login = driver.findElement(By.xpath("//button[contains(@onclick,'logIn()')]"));
		login.click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
		 //WebDriverWait wait1=new WebDriverWait(driver, 90);
        //wait1.until(ExpectedConditions.visibilityOf(ele));
		 //WebElement until2 = wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
          WebElement cli = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
	    cli.click();
	    WebDriverWait wait=new WebDriverWait(driver, 30);
	    Alert until = wait.until(ExpectedConditions.alertIsPresent());
	    until.accept();
		//driver.switchTo().alert().accept();
		WebElement crt = driver.findElement(By.id("cartur"));
		crt.click();
		WebElement order = driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
		order.click();
		WebElement nme = driver.findElement(By.id("name"));
		nme.sendKeys("dharani");
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("india");
		WebElement id = driver.findElement(By.xpath("//input[@id='city']"));
		id.sendKeys("chennai");
		WebElement cardd = driver.findElement(By.id("card"));
		cardd.sendKeys("1234567890123456");
		WebElement mnth = driver.findElement(By.id("month"));
		mnth.sendKeys("09");
		WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
		year.click();
		Robot a= new Robot();
		a.keyPress(KeyEvent.VK_2);
		a.keyPress(KeyEvent.VK_0);
		a.keyPress(KeyEvent.VK_2);
		a.keyPress(KeyEvent.VK_4);
		a.keyRelease(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_0);
		a.keyRelease(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_4);
		WebElement pur = driver.findElement(By.xpath("//button[text()='Purchase']"));
		pur.click();
		WebElement k = driver.findElement(By.xpath("//p[contains(@class,'lead text-muted ')]"));
		String text = k.getText();
		System.out.println(text);
		TakesScreenshot s=(TakesScreenshot) driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Screenshot\\Ablaze.png");
		FileUtils.copyFile(src, des);
		
		WebElement ok = driver.findElement(By.xpath("//button[text()='OK']"));
		ok.click();
		
		
		
	}

}
