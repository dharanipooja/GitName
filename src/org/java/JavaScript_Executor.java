package org.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Java1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13348111890198573240&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061919&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,4000)");
//		js.executeScript("window.scrollBy(0,-2000)");
//		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("(//a[contains(@class,'icp-button')])[1]"));
       // js.executeScript("arguments[0].scrollIntoView();",l);
		js.executeScript("arguments[0].click();",l);
       

	}

}
