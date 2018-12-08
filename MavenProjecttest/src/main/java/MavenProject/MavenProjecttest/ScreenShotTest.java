package MavenProject.MavenProjecttest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotTest {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","E:\\credit\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Actions s1= new Actions(driver);
		s1.moveToElement(driver.findElement(By.xpath("//a[@href='SwitchTo.html']"))).build().perform();
	// File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //FileUtils.copyFile(scrFile,new File("D:\\CaptureScreenshot\\google.jpg"));
		//Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
}
}

