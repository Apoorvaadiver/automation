package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
TakesScreenshot	ts =(TakesScreenshot)driver;
File src= ts.getScreenshotAs(OutputType.FILE);
File dst = new File("C:\\Users\\Dell\\Pictures\\sreenshot1\\screen1.jpeg");
FileUtils.copyFile(src, dst);
	
	
} 
}
