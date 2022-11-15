package org.git;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplegit {
	@Test
	public void Login() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://adactinhotelapp.com/");
		File f=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(f, new File("C:\\Users\\PGS\\eclipse-workspace\\Gittest\\screenshot"));
		//FileHandler.copy(f,new File("C:\\Users\\PGS\\eclipse-workspace\\Gittest\\screenshot\\goo.png"));
	
	
	

}
}