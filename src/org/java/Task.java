package org.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13348111890198573240&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061919&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		Actions s=new Actions(driver);
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		s.contextClick(mob).perform();
		Robot r=new Robot();
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_ENTER);
  
		
	}

}
