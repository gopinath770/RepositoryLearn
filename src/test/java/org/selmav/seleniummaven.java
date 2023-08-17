package org.selmav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniummaven {
	public static void main(String[] args) throws IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement usr = driver.findElement(By.id("username"));
		usr.sendKeys("Suba9597");
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys("Suba@1997");
		WebElement clk = driver.findElement(By.xpath("//input[@name='login']"));
		clk.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;		
		File scrn = ts.getScreenshotAs(OutputType.FILE);
		File tar=new File("C:\\Users\\admin\\Downloads\\scrnsht\\akka.jpg");
		FileUtils.copyFile(scrn, tar);
		
		WebElement sell = driver.findElement(By.id("location"));
		Select se=new Select(sell);
		se.selectByIndex(2);
		
		WebElement yyy = driver.findElement(By.id("datepick_in"));
		Robot ff=new Robot();
		ff.keyPress(KeyEvent.VK_1);
		ff.keyRelease(KeyEvent.VK_1);
		
		JavascriptExecutor p=(JavascriptExecutor)driver;
		WebElement cllk = driver.findElement(By.id("Submit"));
		p.executeScript("arguments[0].click()",cllk);
		
		

		
		
		
		}

}
