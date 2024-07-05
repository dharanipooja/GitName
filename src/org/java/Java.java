package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement con = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		con.click();
		driver.switchTo().alert().dismiss();
		WebElement send = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		send.click();
		WebElement send1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		send1.click();
		driver.switchTo().alert().sendKeys("driver");
		driver.switchTo().alert().accept();
	}

}
