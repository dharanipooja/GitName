package org.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Task {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("dharanipoojaa");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("welcome@12345");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement l = driver.findElement(By.id("location"));
		Select s=new Select(l);
		s.selectByIndex(5);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2=new Select(type);
		s2.selectByVisibleText("Deluxe");
		WebElement nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(nos);
		s3.selectByIndex(3);
		WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		date.clear();
		date.sendKeys("22/06/2024");
		WebElement date1 = driver.findElement(By.id("datepick_out"));
		date1.clear();
		date1.click();
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_2);
		a.keyPress(KeyEvent.VK_7);
		a.keyPress(KeyEvent.VK_SLASH);
		a.keyPress(KeyEvent.VK_0);
		a.keyPress(KeyEvent.VK_6);
		a.keyPress(KeyEvent.VK_SLASH);
		a.keyPress(KeyEvent.VK_2);
		a.keyPress(KeyEvent.VK_0);
		a.keyPress(KeyEvent.VK_2);
		a.keyPress(KeyEvent.VK_4);
		a.keyRelease(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_7);
		a.keyRelease(KeyEvent.VK_SLASH);
		a.keyRelease(KeyEvent.VK_0);
		a.keyRelease(KeyEvent.VK_6);
		a.keyRelease(KeyEvent.VK_SLASH);
		a.keyRelease(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_0);
		a.keyRelease(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_4);
		
		WebElement rooms = driver.findElement(By.id("adult_room"));
		Select s4=new Select(rooms);
        s4.selectByIndex(2);
	    WebElement child = driver.findElement(By.id("child_room"));
	    Select s5=new Select(child);
	    s5.selectByIndex(3);
	    WebElement submit = driver.findElement(By.id("Submit"));
	    submit.click();
	    WebElement btn = driver.findElement(By.id("radiobutton_0"));
	    btn.click();
	    WebElement cont = driver.findElement(By.id("continue"));
	    cont.click();
	    WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	    name.sendKeys("dharani");
	    WebElement name1 = driver.findElement(By.xpath("//input[@name='last_name']"));
	    name1.sendKeys("mn");
	    WebElement address = driver.findElement(By.className("txtarea"));
	    address.sendKeys("no: 123,chennai");
	    WebElement card = driver.findElement(By.xpath("(//input[contains(@onkeypress,'return OnlyNumbersonly(event)')])[1]"));
	    card.sendKeys("1234567890123456");
	    WebElement tpe = driver.findElement(By.id("cc_type"));
	    Select s6=new Select(tpe);
	    s6.selectByIndex(2);
	    WebElement mnth = driver.findElement(By.name("cc_exp_month"));
	    Select s7=new Select(mnth);
	    s7.selectByValue("4");
	    WebElement yr = driver.findElement(By.id("cc_exp_year"));
	    Select s8 =new Select(yr);
	    s8.selectByIndex(3);
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    cvv.sendKeys("123");
	    WebElement book = driver.findElement(By.name("book_now"));
	    book.click();
	    Thread.sleep(9000);
	    WebElement iterinery = driver.findElement(By.id("my_itinerary"));
	    iterinery.click();
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File des=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Screenshot\\adactin.png");
	    FileUtils.copyFile(src, des);
	    
	    
		
		
		
	}

}
